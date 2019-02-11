package com.cg.oiqgs.ui;

import java.util.List;

import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.PolicyQuestions;
import com.cg.oiqgs.serviceimpl.InsuranceQuotesServiceImpl;
import com.cg.oiqgs.servise.InsuranceQuotesService;

public class PolicyView {
	
	static String username;
	public static void main(String[] args) throws OiqgsException {
		
		InsuranceQuotesService insuranceservice = new InsuranceQuotesServiceImpl();
		
		List<PolicyQuestions> list = insuranceservice.viewingPolicy(username);
          
		
		
	}
	public void getUserName(String userName2) {
		
		userName2=username;
		
	}
	
	

}
