package com.cg.oiqgs.dao;

public interface QueryMapper {
	
	String insertQuery = "insert into accounts values(account_number_seq.Nextval,?,?,?,?,?,?)";
	
	String accountSequence ="Select account_number_seq.CURRVAL from dual";

	String selectBusinessSegment = "Select * from businessSegment";
	
	String checkingAccount = "select account_number from accounts";
  
	String getingQuestions = "select* from policyQuestions where bus_seg_id=(select bus_seg_id from businessSegment where bus_seg_name=?)";
	
	String insertingPolicy ="insert into policy values(?,policy_number_seq.nextval,?,?)";
	
	String displayPolicyNumber = "select policy_number_seq.CURRVAL from dual";
	
	
	String insertPolicyDetails ="insert into policyDetails values(?,?,?)";
	
	String viewingPolicy=" select p.policy_number,p.policy_premium,p.business_segment,p.account_number from policy p,accounts a,userrole u where u.username=a.username and a.account_number=p.account_number and u.username=?";;
}
