package com.main;

import java.util.Scanner;

import com.connection.DatabaseConnection;

public class AdminHome {
	public  static void startupOptions() {
		AdminActivity();
			
		}
	public static void AdminActivity() {
		System.out.println("Welcome Admin");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome Admin!");
		System.out.println("Enter Your Choice");
		System.out.println("1)Add Product\n2)Calculate Bill\n3)Display amount to End User\n4)Check Quantity\n5)Check registered user\n6)User history\n7)Exit");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			addProductDetails();
			break;
		case 2:
			calculateBill();
			break;
		case 3:
			displayAmountProduct();
			break;
		case 4:
			checkQuantityProduct();
			break;
		case 5:
			FetchUserDetails.ViewUserDetails();
			break;
		
		case 6:
			viewProductBuyHistory();
			break;
		case 7:
			exit();
			break;
		
		default:
			System.out.println("Invalid Option! Try Again!");
			startupOptions();
			break;
		}

	}
	private static void viewProductBuyHistory() {
		// TODO Auto-generated method stub
		
	}

	

	private static void checkQuantityProduct() {
		// TODO Auto-generated method stub
		
	}

	private static void displayAmountProduct() {
		// TODO Auto-generated method stub
		
	}

	private static void calculateBill() {
		// TODO Auto-generated method stub
		
	}

public  static void addProductDetails() {
		
		AddProduct.addProductDetails();
	}

public static  void exit()  {
		System.out.println("Application Stopped!");
			DatabaseConnection db=new DatabaseConnection();
			db.destroyConnection();
			Continue.continueApp();
	}


}
