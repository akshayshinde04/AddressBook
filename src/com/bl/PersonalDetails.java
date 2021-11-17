package com.bl;
import java.util.*;

public class PersonalDetails {
	private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNo;
    private String email;
	
    Scanner scanObj = new Scanner(System.in);

	public void getFirstName(){
		System.out.println("Enter First Name");
		 firstName = scanObj.nextLine();
	}
	public void getLastName() {
		System.out.println("Enter Last Name");
		 lastName = scanObj.nextLine();
	}
	public void getAddress() {
		System.out.println("Enter your Address");
		address  = scanObj.nextLine();
	}
	public void getStateName() {
		System.out.println("Enter Your State");
		 state = scanObj.nextLine();
	}
	public void getPhoneNumber() {
		System.out.println("Enter the Phone Number");
		 phoneNo = scanObj.nextLine();	
	}
	public void getEmail() {
		System.out.println("Enter the Email ");
		 email = scanObj.nextLine();	
	}
	 public void getZipCode() { System.out.println("Enter Your Zip Code"); 
	 zipCode = scanObj.nextLine();
	} 
	
	@Override
	public String toString() {
		return "PersonalDetails [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zipCode=" + zipCode + ", phoneNo=" + phoneNo + ", email=" + email
				+ ", scanObj=" + scanObj + "]";
	}
    
    
}
