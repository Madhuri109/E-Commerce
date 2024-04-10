package com.main;

import java.util.Scanner;

import com.connection.DatabaseConnection;

public class GuestHome {
	
	public  static void startupOptions() {
	GuestActivity();
		
	}

	public static void GuestActivity() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome Guest!!!");
		System.out.println("Enter Your Choice");
		System.out.println("1)View Product\n2)Exit");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			ViewAllProduct.guestViewAllProduct();
			break;
		case 2:
			exit();
			break;
		default:
			System.out.println("Invalid Option! Try Again!");
			startupOptions();
			break;
		}
	}
public static  void exit()  {
		System.out.println("Application Stopped!");
			DatabaseConnection db=new DatabaseConnection();
			db.destroyConnection();
			Continue.continueApp();
	}


}
