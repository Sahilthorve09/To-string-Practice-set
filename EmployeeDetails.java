package com.practiceset;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		Employee detail1 = new Employee(01,"Sahil Thorve",12);
		Employee detail2 = new Employee(02,"Adesh Pol",12.5);
		Employee detail3 = new Employee(01,"Ritik Shete",13.2);
		System.out.println(detail1);
		System.out.println(detail2.equals(detail2));
		System.out.println(detail2.hashCode());
	}
	
}
