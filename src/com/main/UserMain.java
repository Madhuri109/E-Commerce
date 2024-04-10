package com.main;


import java.util.Scanner;

import com.connection.DatabaseConnection;

public class UserMain {
public static   void startupOptions() {
			UserActivity();
}
public  static  void  UserActivity() {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Welcome UserHome !");
			System.out.println("Enter Your Choice");
			System.out.println("1)User View Product \n2)Buy Product \n3)View Cart \n4)Purchase\n5)Exit");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				//SortingOrder.ViewAllProduct();
				break;
			case 2:
				UserBuyProduct.BuyProduct();
				break;
			case 3:
				exit();
				break;
	           case 4:
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

