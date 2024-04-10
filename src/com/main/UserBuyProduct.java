package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class UserBuyProduct {
	public static   void startupOptions() {
		BuyProduct();
	}
	public static void BuyProduct() {
		 try {
	            // Connect to SQL database
 		 Class.forName("com.mysql.cj.jdbc.Driver");
				Connection project=DriverManager.getConnection("jdbc:mysql://localhost:3306/e-commerce", "root", "Madhuri@123");
				String query = ("SELECT * FROM prod");
				Statement statement=project.createStatement();
         //  product items from the database
         ResultSet resultSet= statement.executeQuery(query);
         ArrayList<Product> products = new ArrayList<>();
         while (resultSet.next()) {
         	int product_id=resultSet.getInt("product_id");
             String name = resultSet.getString("name");
             int price = resultSet.getInt("price");
             Product product = new Product(product_id, name, price);
             products.add(product);
         }

         // Sort products by id
         Collections.sort(products, Comparator.comparing(Product::getProduct_id));

         Scanner scanner = new Scanner(System.in);
         ArrayList<Product> cart = new ArrayList<>();
         boolean shopping = true;

         while (shopping) {
             // Display sorted products
             System.out.println("Products in sorted order:");
             for (int i = 0; i < products.size(); i++) {
                 System.out.println((i + 1) + ". " + products.get(i));
             }

             // User Operations
             System.out.println("1. Buy a product");
             System.out.println("2. View cart");
             System.out.println("3. Purchase");
             System.out.println("4. Exit");
             System.out.print("Choose an option: ");
             int option = scanner.nextInt();
            
             switch (option) {
           //to buy product 
                 case 1:
                     System.out.print("Enter the number of the product you want to buy: ");
                     int product_id = scanner.nextInt();
                     if (product_id >= 0 && product_id < products.size()) {
                         cart.add(products.get(product_id));
                         System.out.println("Product added to cart: " + products.get(product_id).getName());
                     } else {
                         System.out.println("Invalid product number!");
                     }
                     break;
           //to view card of purchase products          
                 case 2:
                     System.out.println("Items in cart:");
                     int total = 0;
                     for (Product product : cart) {
                         System.out.println(product);
                         total += product.getPrice();
                     }
                    
                     break;
            //  Total Amount  
                 case 3:
                     int purchaseTotal = 0;
                     for (Product product : cart) {
                         purchaseTotal += product.getPrice();
                     }
                     System.out.println("Total amount to be paid: " + purchaseTotal);
                     System.out.print("Confirm purchase (yes/no): ");
                     String confirm = scanner.next();
                     if (confirm.equalsIgnoreCase("yes")) {
                 // if want to purchase yes else no
                         System.out.println("Purchase successful!");
                         cart.clear();
                     } else {
                         System.out.println("Purchase cancelled.");
                     }
                     break;
                 case 4:
                     shopping = false;
                     System.out.println("Exiting...");
                     break;
                 default:
                     System.out.println("Invalid option!");
                     break;
             }
         }

     } catch (SQLException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 

	}}


		
	

