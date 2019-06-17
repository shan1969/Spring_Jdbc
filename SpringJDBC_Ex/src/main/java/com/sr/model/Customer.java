package com.sr.model;

public class Customer {
	
	private int custcode;
	private String custname;
	private int amount;
	
	//Default Constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized Constructors
	public Customer(int custcode, String custname, int amount) {
		super();
		this.custcode = custcode;
		this.custname = custname;
		this.amount = amount;
	}
	
	
	//getters and setters
	
	public int getCustcode() {
		return custcode;
	}

	public void setCustcode(int custcode) {
		this.custcode = custcode;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
