package com.bl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<PersonalDetails> contact = new ArrayList<PersonalDetails>();
	public static Scanner scanner = new Scanner(System.in);
	static int menu;
	public static int choice() {
		System.out.println(" 0. Exit. ");
		System.out.println(" 1. Delete contact. ");
		menu = scanner.nextInt();
		return menu;
	}
	public static void main(String[] args) {
		AddDetails addPersonDetail = new AddDetails();
		menu = choice();
		while (menu != 0) {
			if (menu > 1)
				menu = choice();
			switch (menu) {
			
			case 1:
				addPersonDetail.deleteContact(contact);
				break;

			default:
				System.out.println("Please choose a valid Option");
				break;

			}
			for (int i = 0; i < contact.size(); i++)
				System.out.println(contact.get(i));
			{
				System.out.println("Goodbye!");
			}
		}
	}
}
