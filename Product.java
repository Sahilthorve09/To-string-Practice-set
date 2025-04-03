package com.practiceset;

public class Product {
	
	int id;
	String name;
	double price;
	
	private Product(int id, String name, double price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		Product detail1 = new Product(1010, "T-shirt", 200);
		Product detail2 = new Product(1012, "Formal shirt", 700);
		Product detail3 = new Product(1015, "Printed shirt", 600);
		System.out.println(detail1);
		System.out.println(detail2.equals(detail2));
		System.out.println(detail3.hashCode());
	}
}
