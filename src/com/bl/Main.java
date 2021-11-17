package com.bl;


public class Main extends PersonalDetails {
	public static void main(String[] args) {
		PersonalDetails person = new PersonalDetails();
		person.getFirstName();
		person.getLastName();
		person.getAddress();
		person.getStateName();
		person.getPhoneNumber();
		person.getEmail();
		person.getZipCode();
		System.out.println(person.toString());
	}
}

	