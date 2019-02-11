package com.cg.oiqgs.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.oiqgs.exception.OiqgsException;
import com.cg.oiqgs.model.Accounts;
import com.cg.oiqgs.model.UserRole;
import com.cg.oiqgs.serviceimpl.InsuranceQuotesServiceImpl;
import com.cg.oiqgs.servise.InsuranceQuotesService;

public class AccountCreation {
	public static void main(String[] args) {

		Scanner scanner = null;
		boolean flag = false;
		
		InsuranceQuotesService insuranceservice = new InsuranceQuotesServiceImpl();

		do {
			try {
				scanner = new Scanner(System.in);
				System.out.println("enter the name");
				String name = scanner.nextLine();
				System.out.println("enter the street");
				String street = scanner.nextLine();
				System.out.println("enter the city");
				String city = scanner.nextLine();
				System.out.println("enter the state");
				String state = scanner.nextLine();
				System.out.println("enter the zipcode");
				Long zip = scanner.nextLong();
				
				Accounts accounts = new Accounts();
				accounts.setInsuredName(name);
				accounts.setInsuredStreet(street);
				accounts.setInsuredCity(city);
				accounts.setInsuredCity(state);
				accounts.setInsuredZip(zip);
				
				
				UserRole role = new UserRole();
				role.setUserName("agent");
				
				
				/* this is used to send username to policyview*/
				PolicyView policyView1 = new PolicyView();
				policyView1.getUserName(role.getUserName());

				boolean validateFields = insuranceservice.validateFields(accounts);
				
				if(!validateFields) {
					
				}else {
					
					
					try {
						Long insertingData = insuranceservice.insertingDetails(accounts,role);
						flag=true;
						System.out.println(insertingData);
						
					} catch (OiqgsException e) {
						
						e.printStackTrace();
					}
					
				}

				
			} catch (InputMismatchException e) {

				System.out.println("please enter only digits");

			}

		} while (!flag);

	}

}
