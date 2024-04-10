package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewCart {
	public static void getViewCart() {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// step-2 Establish the Connection
				Connection project = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-commerce", "root", "Madhuri@123");

				// step-3 Prepare the Statement

				String sql = "Select user.user_id,username, email_id, Product_id,name,price,quantity from user INNER JOIN prod on user.user_id = prod.Product_id";
				PreparedStatement preparedStatement = project.prepareStatement(sql);

				ResultSet set = preparedStatement.executeQuery();

				while (set.next()) {
					// Product_id
					System.out.println("User_id>> " + set.getInt(1) + " | User_Name>> " + set.getString(2)
							+ " | Email_Id>> " + set.getString(3) + " | Product_Id>> " + set.getInt(4) + "| ProductName>>"+set.getString(5)+"| Price >>"+set.getInt(6)+"| Quantity >>"+set.getInt(7));
				
			} 
			}
				catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			ContinueHome.continueApp();
}
}
			

	
