package com.largecompany.accounts;

public class Client {

	private String firstName;
	private String lastName;
	
	private int [] orderNums = new int[10];
	private double [] orderAmts = new double[10];
	
	private int counter = 0;
	
	public Client(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

	public void addPurchase(int orderNumber, double amount) {
		
		orderNums[counter] = orderNumber;
		orderAmts[counter] = amount;
		counter ++;
	}

	public double getBill() {
		double returnVal = 0;
		
		for (double a : orderAmts) {
			returnVal += a;
		}
		
		return returnVal;
	}

	
	
}
