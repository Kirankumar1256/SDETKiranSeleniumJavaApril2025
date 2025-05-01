package com.Java1;

public class JavaBasics {
	int a =10;
	static int b = 1;
	
	public void disclose() {
		int x = 45;
		System.out.println(x);
	}
	
	public static void sum(int i, int y) {
		System.out.println(i+y);
	}
			

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int d = 56;
		JavaBasics obj = new JavaBasics();
		System.out.println(obj.a);
		System.out.println(b);
		System.out.println(d);
		sum(8,9);
		obj.disclose();
	}
}
