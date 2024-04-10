package com.main;

public class Product {

private int product_id;
		private String name;
		private String description;
		private int price;

		public Product(int product_id, String name, int price) {
		    	this.product_id=product_id;
		        this.name = name;
		        this.description=description;
		        this.price = price;
		    }

		public int getProduct_id() {
			return product_id;
		}

		public String getName() {
			return name;
		}
	    public String getdescription() {
			return description;
	    }
		public int getPrice() {
			return price;
		}

		@Override
		public String toString() {
			return "Product{" + "product_id=" + product_id + ", name=" + name + '\'' + ", price=" + price + '}';
		}
	}
