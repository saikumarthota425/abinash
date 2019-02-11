package com.cg.oiqgs.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.oiqgs.exception.OiqgsException;

public class UI {
	public static void main(String[] args) throws OiqgsException {
		Scanner scanner = null;
		boolean flag = false;
		do {
			System.out.println("*****agent*****");
			System.out.println("1.Account Creation");
			System.out.println("2.Policy Creation");
			System.out.println("3.View Policy");
			System.out.println("select option");

			scanner = new Scanner(System.in);
			try {
				int choice = scanner.nextInt();
				flag = true;

				switch (choice) {
				case 1:
					
					AccountCreation  accountCreation = new AccountCreation();
					accountCreation.main(null);

					break;
				case 2:
					
					PolicyCreation policyCreation = new PolicyCreation();
					policyCreation.main(null);

					break;
				case 3:
					PolicyView policyView = new PolicyView();
					policyView.main(null);


					break;
				default:
					System.err.println("enter choice between 1 to 3");
					flag = false;

					break;
				}

			} catch (InputMismatchException e) {

				System.err.println("please enter only digits");

			}

		} while (!flag);

	}

}
