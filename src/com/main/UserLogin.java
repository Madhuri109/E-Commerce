package com.main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class UserLogin{ 
private static String username;
private static String password;

public static void loginUser() {
		try {
			 Scanner scanner=new Scanner(System.in);
				System.out.print("Enter UserName: ");
				String username = scanner.nextLine();
				System.out.print("Enter Password: ");
				String password = scanner.nextLine();
		Class.forName("com.mysql.cj.jdbc.Driver");// load Driver

			Connection project = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-commerce", "root", "Madhuri@123"); //connection
			
			String query = "SELECT * FROM user WHERE username= ? AND password=?";
            PreparedStatement preparedStatement = project.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2,password);
           // Executing the query
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                // Login successful
                System.out.println("Use Login successfully..");
          startupOptions();
                
            } else {
                // Login failed
                System.out.println("Invalid username or password. Please try again.");
            }

            // Closing the resources
            resultSet.close();
            preparedStatement.close();
	}
		catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
		}
	}

private static void startupOptions() {
FinalProject.startupOptions();
	
}


	
		
			

}

    
