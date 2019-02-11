package com.cg.oiqgs.model;

public class Accounts {
	
	private long accountNumber;
	private String insuredName;
	private String insuredStreet;
	private String insuredCity;
	private String insuredState;
	private long insuredZip;
	private String userName;
	
	
	public Accounts() {
		// TODO Auto-generated constructor stub
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getInsuredName() {
		return insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public String getInsuredStreet() {
		return insuredStreet;
	}

	public void setInsuredStreet(String insuredStreet) {
		this.insuredStreet = insuredStreet;
	}

	public String getInsuredCity() {
		return insuredCity;
	}

	public void setInsuredCity(String insuredCity) {
		this.insuredCity = insuredCity;
	}

	public String getInsuredState() {
		return insuredState;
	}

	public void setInsuredState(String insuredState) {
		this.insuredState = insuredState;
	}

	public long getInsuredZip() {
		return insuredZip;
	}

	public void setInsuredZip(long insuredZip) {
		this.insuredZip = insuredZip;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	
	public Accounts(long accountNumber, String insuredName, String insuredStreet, String insuredCity,
			String insuredState, long insuredZip, String userName) {
		super();
		this.accountNumber = accountNumber;
		this.insuredName = insuredName;
		this.insuredStreet = insuredStreet;
		this.insuredCity = insuredCity;
		this.insuredState = insuredState;
		this.insuredZip = insuredZip;
		this.userName = userName;
		
	}
	
      	
   	

}
