package com.cg.oiqgs.dao;

import java.util.List;

import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.Accounts;
import com.cg.oiqgs.model.BusinessSegment;
import com.cg.oiqgs.model.PolicyQuestions;
import com.cg.oiqgs.model.UserRole;

public interface InsuranceQuotesDao {

	Long insertingDetails(Accounts accounts, UserRole role) throws OiqgsException;

	List<BusinessSegment> SelectBusinessSegment() throws OiqgsException;

	List<PolicyQuestions> getQuestions(String businessname) throws OiqgsException;

	boolean checkingAccountNumber(Long accountNumber) throws OiqgsException;

	Long insertingDetails(Long accountNumber, Double preium, String policyName) throws OiqgsException;

	boolean insertingPolicy(List<PolicyQuestions> policyDetails, Long policynumber) throws OiqgsException;

	List<PolicyQuestions> viewingpolicy(String username) throws OiqgsException;

	

}
