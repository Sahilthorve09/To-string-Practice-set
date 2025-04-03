package com.practiceset;

public class Book {
	String title; 
	String aurthor; 
	double price;
	private Book(String title, String aurthor, double price) {

		this.title = title;
		this.aurthor = aurthor;
		this.price = price;

	}
	
	

	@Override
	public String toString() {
		return "Book [title=" + title + ", aurthor=" + aurthor + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		
		Book detail1 = new Book("xyz", "zyx", 120.50);
		System.out.println(detail1);
		
	}
}
