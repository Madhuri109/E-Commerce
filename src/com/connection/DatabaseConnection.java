
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseConnection {

	private Connection con = null;
	public PreparedStatement stmt = null;

	public DatabaseConnection() {
		if (con == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-commerce", "root", "Madhuri@123");

				for (int i = 0; i < 50; i++) {
					System.out.println("\n");
				}
			} catch (Exception e) {

			}
		}
	}

	public Connection getConnection() {
		return con;
	}
public  void destroyConnection() {
		try {
			con.close();
			stmt.close();
		} catch (Exception e) {

		} finally {
			con = null;
			stmt = null;
		}
	}
	
}




