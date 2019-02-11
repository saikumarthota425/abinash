package com.cg.oiqgs.servise;

import java.util.List;

import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.Accounts;
import com.cg.oiqgs.model.BusinessSegment;
import com.cg.oiqgs.model.PolicyQuestions;
import com.cg.oiqgs.model.UserRole;

public interface InsuranceQuotesService {

	boolean validateFields(Accounts accounts);

	Long insertingDetails(Accounts accounts, UserRole role) throws OiqgsException;

	List<BusinessSegment> SelectBusinessSegment() throws OiqgsException;

	List<PolicyQuestions> getQuestions(String businessname) throws OiqgsException;

	boolean checkingAccountNumber(Long accountNumber) throws OiqgsException;

	Long insertingPolicy(Long accountNumber, Double preium, String policyName) throws OiqgsException;

	boolean insertingPolicyDetails(List<PolicyQuestions> policyDetails, Long policynumber) throws OiqgsException;

	List<PolicyQuestions> viewingPolicy(String username) throws OiqgsException;

	
}
