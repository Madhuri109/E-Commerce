package com.main;

import java.util.Scanner;

import com.connection.DatabaseConnection;

public class UserHome
{
	public static   void startupOptions() {
		UserActivity();
	}
	
public  static  void  UserActivity() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome User!");
		System.out.println("Enter Your Choice");
		System.out.println("1)User Register\n2)User Login \n3)Exit");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			UserRegistration.registerNewUser();
		
		case 2:
			UserLogin.loginUser();
			break;
		  case 3:
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