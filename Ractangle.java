package com.practiceset;

public class Ractangle {
	
	int l;
	int b;
	
	public Ractangle(int l, int b) {
		this.l = l;
		this.b = b;
		int sum = l*b;
		System.out.println("Total sum is: "+sum);
		
	}

	@Override
	public String toString() {
		return "Ractangle [l=" + l + ", b=" + b + "]";
	}
	
	
}
