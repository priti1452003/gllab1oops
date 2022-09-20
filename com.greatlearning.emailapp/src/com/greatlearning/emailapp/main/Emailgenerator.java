package com.greatlearning.emailapp.main;

import java.util.Random;
import java.util.Scanner;


public class Emailgenerator{
	public static void main(String[] args) {
	
	 String companyname = "Myapp";
   // final String[] firstname = {"Priti", "Jahanvi", "Ayati"};
    //final String[] lastname = {"Joshi", "Surve", "Khambalikar"};
    final String[] department = {"tech","admin","hr","lg"};
    String emailid;
    String password;
    String dept;
    
	
	 
	
	System.out.println("Enter your First Name : ");
	Scanner sc = new Scanner(System.in);
	String fname = sc.next();
	System.out.println("Enter your Last name :");
	Scanner  sc1 = new Scanner(System.in);
	String lname = sc1.next();
	
	System.out.println("Please enter your department number from the following :");
	System.out.println(" 1 - Technical ");
	System.out.println("2 - Administration ");
	System.out.println("3 - Human Resource "); 
	System.out.println("4 - Legal ");
	Scanner sc2= new Scanner(System.in); 
	int x = sc2.nextInt();

		 //String generateEmailid(fname, lname , department[], companyname){
			//return fname+lname+"@"+department[x-1]+"."+companyname;
	System.out.println("Dear "+fname+" your generated credentias are as follows : ");
	String generateemailid=fname+lname+"@"+department[x-1]+"."+companyname;
	System.out.println("Email id ----->" + generateemailid);
	
	 String lowcase = "abcdefghijklmnopqrstuvxyz";
	 String upCase = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
	 String Numbers = "0 1 2 3 4 5 6 7 ";
	 String SpecialChar = "£$&()*+[]@#^-_!?";
	 String Combination = lowcase+upCase+Numbers+SpecialChar;
	int length = 8;
char[] Password = new char[length];
	Random r = new Random();
	for (int i=0; i<length; i++) {
		Password[i]= Combination.charAt(r.nextInt(Combination.length()));
}
	System.out.println("Password ----> "+ new String(Password));

	
	}

	 }
	


