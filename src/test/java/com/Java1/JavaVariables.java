package com.Java1;

public class JavaVariables {
	
	int a = 10;
	String b = "Kiran";
	char c = 'T';
	
	static int d = 356;
	
	public int salary(int x, int y) {
		System.out.println("No. of days:"+x + "No.of wrkng days:"+y);
		return x*y;
	}
	
	public static void display() {
		System.out.println("I am happy");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(d);
		JavaVariables obj = new JavaVariables();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		obj.salary(9,8);
		System.out.println(obj.salary(10, 20));	
		
	}

}
