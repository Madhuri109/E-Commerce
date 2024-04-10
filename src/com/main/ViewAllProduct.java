
package com.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ViewAllProduct {
public  static void guestViewAllProduct()
	{
	try {
Class.forName("com.mysql.cj.jdbc.Driver");// load Driver
Connection project = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-commerce", "root", "Madhuri@123"); //connection
		String query="Select * from prod";
		PreparedStatement ps=project.prepareStatement(query);
	
		ResultSet resultSet=ps.executeQuery();
		System.out.println("*****************************************Product_List********************************");
	while (resultSet.next())
	{
	
		System.out.println("Product_id>> " + resultSet.getInt(1) + " | Product_Name>> " + resultSet.getString(3) + " | Description>> " + resultSet.getString(2) + " | Price>> " + resultSet.getString(4) +  " |Quantity>> "  + resultSet.getString(5));
	
	}
	}
	 catch (SQLException | ClassNotFoundException e) {
	 
	 }
		ContinueGuest.continueApp();
	
	}

}
