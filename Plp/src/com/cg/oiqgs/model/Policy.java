package com.cg.oiqgs.model;

public class Policy {
	
	public Object getBusinessSegment() {
		return BusinessSegment;
	}


	public void setBusinessSegment(Object businessSegment) {
		BusinessSegment = businessSegment;
	}


	public Long getPolicyNumber() {
		return policyNumber;
	}


	public void setPolicyNumber(Long policyNumber) {
		this.policyNumber = policyNumber;
	}


	public Double getPolicyPremium() {
		return policyPremium;
	}


	public void setPolicyPremium(Double policyPremium) {
		this.policyPremium = policyPremium;
	}


	public Long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}


	private Object BusinessSegment;
	private Long policyNumber;
	private Double policyPremium;
	private Long accountNumber;
	
	
	public Policy() {
		// TODO Auto-generated constructor stub
	}


	public Policy(Object businessSegment, Long policyNumber, Double policyPremium, Long accountNumber) {
		super();
		BusinessSegment = businessSegment;
		this.policyNumber = policyNumber;
		this.policyPremium = policyPremium;
		this.accountNumber = accountNumber;
	}
	
	

}
