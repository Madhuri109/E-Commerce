package com.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class AddProduct {
public static void addProductDetails() {

try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection project = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-commerce", "root", "Madhuri@123"); //connection
			Statement stm;
			stm = project.createStatement();
               String Query1 = "insert into prod (Product_id , description, name , price , quantity) values (1,'6.36-inch, 1200x2670 pixels','oppo mobile',12000,25)";
			String Query2 = "insert into prod (Product_id , description, name , price , quantity) values (2,'6.78-inch, 1260x2800 pixels','vivo mobile',15000,30)";
			String Query3 = "insert into prod(Product_id , description, name , price , quantity) values (3,'6.70-inch, 2400x1080 pixels','mi mobile',20000,10)";
			String Query4 = "insert into prod (Product_id , description, name , price , quantity) values (4,'6.80-inch, 1440x3168 pixels','onePlus mobile',40000,85)";
			String Query5 = "insert into prod (Product_id , description, name , price , quantity) values (5,'6.70-inch, 2400x1080 pixels','Blackberry mobile',85000,30)";
			String Query6 = "insert into prod (Product_id , description, name , price , quantity) values (6,'6.80-inch, 2400x1080 pixels','realme mobile',10000,12)";
			String Query7 = "insert into prod(Product_id , description, name , price , quantity) values (7,'6.90-inch, 1344x2992 pixels','redme mobile',7000,7)";
			String Query8 = "insert into prod (Product_id , description, name , price , quantity) values (8,'6.60-inch, 1290x2796 pixels','iPhone mobile',90000,8)";
			String Query9 = "insert into prod (Product_id , description, name , price , quantity) values (9,'6.50-inch, 2400x1080 pixels','Nokia mobile',55000,14)";
			String Query10 = "insert into prod(Product_id , description, name , price , quantity) values (10,'6.40-inch, 2400x1080 pixels','LG mobile',35000,22)";

			stm.execute(Query1);
			stm.execute(Query2);
			stm.execute(Query3);
			stm.execute(Query4);
			stm.execute(Query5);
			stm.execute(Query6);
			stm.execute(Query7);
			stm.execute(Query8);
			stm.execute(Query9);
			stm.execute(Query10);

			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
System.out.println("Add Product Sucessfully");
		}

	}

