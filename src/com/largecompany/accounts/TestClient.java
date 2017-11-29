package com.largecompany.accounts;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClient {

	@Test
	public void testCreatingAClient() {
		
		Client myClient = new Client("Kenneth", "Bogert");
		
//		fail("Not yet implemented");
	}
	
	
	@Test
	public void testGettingFirstLastName() {

		Client myClient = new Client("Kenneth", "Bogert");

		assertTrue( "Firstname is wrong",  myClient.getFirstName().equals("Kenneth") );
		
		assertTrue( "Lastname is wrong",  myClient.getLastName().equals("Bogert") );
		
		assertTrue( "Full Name is wrong",  myClient.getFullName().equals("Kenneth Bogert") );

	
	}
	
	@Test
	public void testBilling() {

		Client myClient = new Client("Kenneth", "Bogert");

		myClient.addPurchase(78238, 57.48);
		
		myClient.addPurchase(93429, 11000.00);
		
		assertTrue( "Bill is incorrect", myClient.getBill() == 11057.48);
		
		
	}
	

}
