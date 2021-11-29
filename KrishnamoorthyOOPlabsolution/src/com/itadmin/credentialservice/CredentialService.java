package com.itadmin.credentialservice;

import java.util.Random;
public class CredentialService {
	
	public char[] generatePassword() {
		String cap="ABCDEFGHIJLMNOPQRSTUVWXYZ";
		String low="abcdefghijklmnopqrstuvwxyz";
		String num="1234567890";
		String spc="!@#$%";
		String combi=cap+low+num+spc;
		Random random = new Random();
		char[] passwd= new char[8];
		
		for (int i=0; i<8; i++) 
		{passwd[i]=combi.charAt(random.nextInt(combi.length()));
		
	}
		return passwd;
	}	
	public String generateEmail(String firstname, String lastname, String department)
	{
		return firstname+lastname+"@"+department+".com";
	}
		
	
	public void showCredentials(com.itadmin.employee.employee employee, String email, char[]generatedPassword) { 
		System.out.println("Dear "+employee.getFirstname()+employee.getLastname()+" your generated credentials are as below");
		System.out.println("Email --->"+email);
		System.out.println("Password --->"+"" +generatedPassword);
		//System.out.println(generatedPassword);
		
	}

}
