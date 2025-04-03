package com.practiceset;

public class Student {
	
	String name;
	int age; 
	public Student(String name,int age ) {
		this.name = name;
		this.age = age;
		
//		System.out.println("Name of student: "+ name);
//		System.out.println("Age of student: "+ age);
//		System.out.println("---------- end -----------");	
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
