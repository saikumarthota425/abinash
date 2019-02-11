package com.cg.oiqgs.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.BusinessSegment;
import com.cg.oiqgs.model.PolicyQuestions;
import com.cg.oiqgs.serviceimpl.InsuranceQuotesServiceImpl;
import com.cg.oiqgs.servise.InsuranceQuotesService;

public class PolicyCreation {

	public static void main(String[] args) throws OiqgsException {
		List<BusinessSegment> list = new ArrayList<>();
		InsuranceQuotesService insuranceservice = new InsuranceQuotesServiceImpl();
		BusinessSegment businessSegment = new BusinessSegment();
		Scanner scanner = null;

		boolean mainflag = true;

		do {
			scanner = new Scanner(System.in);

			try {
				System.out.println("enter your account number");
				Long accountNumber = scanner.nextLong();
				boolean result = insuranceservice.checkingAccountNumber(accountNumber);
				if (result) {

					try {
						list = insuranceservice.SelectBusinessSegment();
						System.out.println("BusName policy");
						System.out.println();

						int choice = 1;
						for (BusinessSegment lis : list) {

							System.out.println(choice++ + " " + lis.getBusSegName());

						}

						scanner = new Scanner(System.in);
						int choices = 0;
						boolean flag1 = false;
						do {
							System.out.println("selectchoice");
							try {
								choices = scanner.nextInt();
								flag1 = false;

								BusinessSegment businessSegment2 = new BusinessSegment();

								switch (choices) {
								case 1:
									businessSegment2.setBusSegName("Business Auto");
									
									break;
								case 2:

									businessSegment2.setBusSegName("Restaurant");
									break;
								case 3:
									businessSegment2.setBusSegName("Apartment");

									break;
								case 4:
									businessSegment2.setBusSegName("General Merchant");

									break;

								default:
									break;
									
									
									
								}
								
								Double preium = 0.0;

								List<PolicyQuestions> lists = insuranceservice.getQuestions(businessSegment2.getBusSegName());

								List<PolicyQuestions> policyDetails= new ArrayList<>();

								for (PolicyQuestions list11 : lists) {

									PolicyQuestions policyDetail = new PolicyQuestions();

									System.out.println(list11.getPolQuesDesc());
									System.out.println("Answer1 " + list11.getPolQuesAns1());
									System.out.println("Answer2 " + list11.getPolQuesAns2());
									System.out.println("Answer3 " + list11.getPolQuesAns3());
									System.out.println("please select one ");

									policyDetail.setPolQuesId(list11.getPolQuesId());

									int pre = scanner.nextInt();
									switch (pre) {
									case 1:
										preium = preium + list11.getPolQuesAns1Weightage();
										policyDetail.setPolQuesAns1(list11.getPolQuesAns1());
										break;

									case 2:
										preium = preium + list11.getPolQuesAns2Weightage();
										policyDetail.setPolQuesAns1(list11.getPolQuesAns2());
										break;
									case 3:
										preium = preium + list11.getPolQuesAns3Weightage();
										policyDetail.setPolQuesAns1(list11.getPolQuesAns3());
										break;

									default:
										break;
									}
								   policyDetails.add(policyDetail);
								}
							

								Long policynumber = insuranceservice.insertingPolicy(accountNumber, preium,
										businessSegment2.getBusSegName());

							
								boolean policyvalidate = insuranceservice.insertingPolicyDetails(policyDetails,policynumber);
								
                                   if(policyvalidate) {
                                	   
                                	   
                                	   System.out.println("policy created");
                                	   System.out.println("your policy number   "+policynumber+"for"+businessSegment2.getBusSegName()+"with premium"+preium
                                			   );
                                   }
								


							} catch (InputMismatchException e) {

								System.out.println("enter only digits");
							}

						} while (flag1);
					} catch (OiqgsException e) {

						e.printStackTrace();
					}

				}

				else {
					System.err.println("accountnumber not exist");
					mainflag = false;
				}
			} catch (InputMismatchException e) {
				System.err.println("please enter only digits");
				mainflag = false;
			}

		} while (!mainflag);
	}

}
