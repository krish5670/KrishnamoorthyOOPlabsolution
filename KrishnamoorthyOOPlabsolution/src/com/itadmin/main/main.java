package com.itadmin.main;

import java.util.Scanner;

import com.itadmin.credentialservice.CredentialService;
import com.itadmin.employee.employee;

public class main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		employee employee = new employee("Krishna","moorthy");
		
		CredentialService cs= new CredentialService();
		String generatedEmail;
		char[] generatedPasswd;
		

		System.out.println("Please enter the department from the below list");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		
		int option = sc.nextInt();
		
		if (option==1) {
			generatedEmail = cs.generateEmail(employee.getFirstname().toLowerCase(),employee.getLastname().toLowerCase(),"tech");
			generatedPasswd=cs.generatePassword();
			cs.showCredentials(employee, generatedEmail,generatedPasswd);
		}
		else if (option==2) {
			generatedEmail = cs.generateEmail(employee.getFirstname().toLowerCase(),employee.getLastname().toLowerCase(),"ad");
			generatedPasswd=cs.generatePassword();
			cs.showCredentials(employee, generatedEmail,generatedPasswd);
		}
		else if (option==3) {
			generatedEmail = cs.generateEmail(employee.getFirstname().toLowerCase(),employee.getLastname().toLowerCase(),"hr");
			generatedPasswd=cs.generatePassword();
			cs.showCredentials(employee, generatedEmail,generatedPasswd);
		}
		else if (option==4) {
			generatedEmail = cs.generateEmail(employee.getFirstname().toLowerCase(),employee.getLastname().toLowerCase(),"lg");
			generatedPasswd=cs.generatePassword();
			cs.showCredentials(employee, generatedEmail,generatedPasswd);
		}
		else 
			System.out.println("Enter a valid input");
		
		sc.close();


		
	}
	

}
