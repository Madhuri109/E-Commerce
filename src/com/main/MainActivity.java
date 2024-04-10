package com.main;
import java.util.Scanner;

import com.connection.DatabaseConnection;
public class MainActivity {
public  static  void startupOptions() {
		System.out.println("Welcome To The  E-Commerce!!");
		System.out.println("Enter Your Choice!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("1)User\n2)Admin\n3)Guest\n4)Exit");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			UserHome.UserActivity();
	         break;
		case 2:
			AdminHome.AdminActivity(); 
			break;
		case 3:
			GuestHome.GuestActivity();
			break;
		case 4:
			exit();
			break;
		default:
			System.out.println("Invalid Option! Please Try Again!");
			startupOptions();
			break;
		}
	
	}
public static void main(String[] args) {
	MainActivity mainActivity=new MainActivity();
	mainActivity.startupOptions();		
}
public static  void exit()  {
	System.out.println("Application Stopped!");
      DatabaseConnection project=new DatabaseConnection();
		project.destroyConnection();
		Continue.continueApp();
		
}


}

