package com.main;


import java.util.Scanner;

import com.connection.DatabaseConnection;

public class FinalProject {
	public static   void startupOptions() {
		UserHomeActivity();
	}
	public static void UserHomeActivity() {
	DisplyProductSorting disply = new DisplyProductSorting();
		BuyProduct buyproduct = new BuyProduct();
		ViewCart viewcart = new ViewCart();
System.out.println("Welcome User Home Page");
System.out.println("1)View Product\n2)Buy Product\n3)View Cart\n4)Purchase\n5)Exit");

System.out.print("Enter Your Choice !!");

		Scanner scanner = new Scanner(System.in);
		
		int option = scanner.nextInt();
		
	switch (option) {
			case 1 :
				disply.viewAllProduct();
				
			case 2:
				buyproduct.buyProduct();
				break;
			// to view card of purchase products
			case 3:
				viewcart.getViewCart();
                     break;
                     
			case 4:
				System.out.print("Confirm purchase (yes/no): ");
				String confirm = scanner.next();
				if (confirm.equalsIgnoreCase("yes")) {
					// if want to purchase yes else no
					System.out.println("Purchase successful..!");
				
				} else {
					System.out.println("Purchase cancelled...!");
				}
				break;
			case 5:
				exit();
				break;
			default:
				System.out.println("Invalid option..!");
				break;
			}
		}

public static  void exit()  {
	System.out.println("Application Stopped!");
      DatabaseConnection project=new DatabaseConnection();
		project.destroyConnection();
}
}
