package com.cg.oiqgs.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.cg.oiqgs.dao.InsuranceQuotesDao;
import com.cg.oiqgs.daoimpl.InsuranceQuotesDaoImpl;
import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.Accounts;
import com.cg.oiqgs.model.BusinessSegment;
import com.cg.oiqgs.model.PolicyQuestions;
import com.cg.oiqgs.model.UserRole;
import com.cg.oiqgs.servise.InsuranceQuotesService;


public class InsuranceQuotesServiceImpl implements InsuranceQuotesService {
	
	
	InsuranceQuotesDao insurancedao = new InsuranceQuotesDaoImpl();

	@Override
	public boolean validateFields(Accounts accounts) {
		
		List<String> list = new ArrayList<>();
		boolean flag =false;
		if(!checkName(accounts.getInsuredName())) {
			list.add("enter name should contains 20 characters");
			
		}
		if(!checkStreet(accounts.getInsuredStreet())) {
			
			list.add("enter correct street");
		}
		
		if(!list.isEmpty()) {
			
			System.err.println(list+"");
			
		}else {
			
			flag =true;
		}
		
		return flag;
	}
	
	
	public boolean checkName(String name) {
		
		String regex = "[A-Z]{1}[A-Za-z\\s]{4,29}$";
		return Pattern.matches(regex, name);
		
	}
	

	public boolean checkStreet(String street) {
		
		String regex = "[A-Za-z\\s]{1,39}$";
		return Pattern.matches(regex, street);
		
	}


	@Override
	public Long insertingDetails(Accounts accounts, UserRole role) throws OiqgsException {
		
		return insurancedao.insertingDetails(accounts,role);
	}


	@Override
	public List<BusinessSegment> SelectBusinessSegment() throws OiqgsException {
		
		return insurancedao. SelectBusinessSegment();
	}


	@Override
	public List<PolicyQuestions> getQuestions(String businessname) throws OiqgsException {
		
		return insurancedao.getQuestions(businessname);
	}


	@Override
	public boolean checkingAccountNumber(Long accountNumber) throws OiqgsException {
		// TODO Auto-generated method stub
		return insurancedao.checkingAccountNumber(accountNumber);
	}


	@Override
	public Long insertingPolicy(Long accountNumber, Double preium,String policyName) throws OiqgsException {

		return insurancedao.insertingDetails(accountNumber, preium,policyName);
	}


	@Override
	public boolean insertingPolicyDetails(List<PolicyQuestions> policyDetails, Long policynumber) throws OiqgsException {
		// TODO Auto-generated method stub
		return insurancedao.insertingPolicy(policyDetails,policynumber);
	}


	@Override
	public List<PolicyQuestions> viewingPolicy(String username) throws OiqgsException {
		// TODO Auto-generated method stub
		return insurancedao.viewingpolicy(username);
	}


	

}
