
package com.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchUserDetails {
public  static void ViewUserDetails()
	{
	try {
Class.forName("com.mysql.cj.jdbc.Driver");// load Driver
Connection project = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-commerce", "root", "Madhuri@123"); //connection
		String query="Select * from user";
		PreparedStatement ps=project.prepareStatement(query);
	
		ResultSet resultSet=ps.executeQuery();
		System.out.println("************************User List***********************");
	while (resultSet.next())
	{
	
		System.out.println("User_Id>> " + resultSet.getInt(1) + " | FirstName>> " + resultSet.getString(2) + " | LastName>> " + resultSet.getString(3) + " | City>> " + resultSet.getString(4) +  " | Email_Id>> "  + resultSet.getString(5) + " | Mobile_Number>> " + resultSet.getString(6) + " | UserName>> " + resultSet.getString(7)
		);
	
		/*System.out.println("FirstName>>"+resultSet.getString(2));
		System.out.println("LastName>>"+resultSet.getString(3));
		System.out.println("City>>"+resultSet.getString(4));
		System.out.println("Email_Id>>"+resultSet.getString(5));
		System.out.println("<Mobile_Number>>"+resultSet.getString(6));
		System.out.println("UserName>>"+resultSet.getString(7));
		System.out.println("Password>>"+resultSet.getString(8));*/
	}
	}	
	 catch (SQLException | ClassNotFoundException e) {
		
	
		}
ContinueAdmin.continueApp();
	}


}
