package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserRegistration {
    private static String firstname;
	private static String lastname;
	private static String username;
	private static String city;
	private static String password;
	private static String email_id;
	private static String mobile_number;
	
	public  static void registerNewUser() {
	
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter First Name: ");
			String firstName = scanner.next();

			System.out.print("Enter Last Name: ");
			String lastName = scanner.next();

			System.out.print("Enter city: ");
			String city = scanner.next();

			System.out.print("Enter email_id: ");
			String email_id = scanner.next();
			
			System.out.print("Enter Mobile Number: ");
			String mobileNumber = scanner.next();

			System.out.print("Enter UserName: ");
			String userName = scanner.next();

			System.out.print("Enter Password: ");
			String password = scanner.next();
			Class.forName("com.mysql.cj.jdbc.Driver");// load Driver

			Connection project = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-commerce", "root", "Madhuri@123"); //connection


			//database Query
			String sql = "insert into user(firstname,lastname,city,email_id, mobile_number, username, password) VALUES ( ?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement preparedStatement = project.prepareStatement(sql);
		
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			preparedStatement.setString(3, city);
			preparedStatement.setString(4, email_id);
			preparedStatement.setString(5, mobileNumber);
			preparedStatement.setString(6, userName);
			preparedStatement.setString(7, password);
			preparedStatement.execute();
			
		}

		catch (ClassNotFoundException e) {

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		System.out.println("User Register Successfully!!!Please Login... ");
		 
	}

	
	
	
}
