package com.bl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static String userInput() {
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		return string;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
	  
        ArrayList<String> addressList = new ArrayList<>();
		
		PersonalDetails personOne = new PersonalDetails();
		System.out.println("Please Enter the Name :");
		personOne.setFirstName(userInput());
		System.out.println("Please Enter Last Name : ");
		personOne.setLastName(userInput());
		System.out.println("Please Enter Address : ");
		personOne.setAddress(userInput());
		System.out.println("Please Enter City : ");
		personOne.setCity(userInput());
		System.out.println("Please Enter State : ");
		personOne.setState(userInput());
		System.out.println("Please Enter Zip Code : ");
		personOne.setZipCode(userInput());
		System.out.println("Please Enter Phone Number : ");
		personOne.setPhoneNo(userInput());
		System.out.println("Please Enter Email : ");
		personOne.setEmail(userInput());
		System.out.println(personOne);
		
	}
}
	