package com.java.dhanasekaran;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class CustomerInfo {

	public static void main(String[] args) {

		CustomerInfo.Details();
	}

	// TODO Auto-generated method stub
	public static void Details() {
		String ctmr, adrs1, adrs2;
		Scanner scr = new Scanner(System.in);
		System.out.println(
				"Enter customer details\n 1,customercode, 2,name, 3,email, 4,phone, 4,customertype, 6,dob, 7,countryofoperation, 8.basecurrency, 9,bankacctno, 10,bankbranch, 11,bankname");
		ctmr = scr.nextLine();
		String[] words = ctmr.split(",");
		ArrayList<String> customer = new ArrayList<>();
		customer.add(ctmr);
		// System.out.println(customer);
		int i = words.length;
		if (i != 11) {
			System.out.println("Your  is Missing");
			Details();
		} else {
			System.out.println("Enter Your Address \n 1.door no, 2. Street, 3.city, 4. State, 5. Country, 6.pincode");
		}
		adrs1 = scr.nextLine();
		String[] adds1 = adrs1.split(",");
		ArrayList<String> adress1 = new ArrayList<>();
		adress1.add(adrs1);
		// System.out.println(adress1);
		int j = adds1.length;
		if (j != 6) {
			System.out.println("Your Address is missing");
			Details();
		} else {
			System.out.println("Enter your Another addres");
		}

		adrs2 = scr.nextLine();

		String[] adds2 = adrs2.split(",");
		ArrayList<String> adress2 = new ArrayList<>();
		adress2.add(adrs2);

		int d = adds2.length;

		if (adrs2.equals("no")) {

			System.out.println("CustomerDetails is");
			HashMap<String, HashMap<String, String>> customerd = new HashMap<String, HashMap<String, String>>();
			HashMap<String, String> customerads = new HashMap<String, String>();
			customerads.put(adrs1, adrs2);
			customerd.put(ctmr, customerads);

			System.out.println(customerd);
		
		}else {
		
			if (d != 6) {
				System.out.println("Your Miss the value");
				Details();
			} else {
				System.out.println("CustomerDetails is");

				HashMap<String, HashMap<String, String>> customerd = new HashMap<String, HashMap<String, String>>();
				HashMap<String, String> customerads = new HashMap<String, String>();
				customerads.put(adrs1, adrs2);
				customerd.put(ctmr, customerads);

				System.out.println(customerd);

			}
		}
	}
}
