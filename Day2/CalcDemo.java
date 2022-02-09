package com.capgemini.sfdc.day2;

public class CalcDemo {
	public static void printNum() { // method - no arguments and no return value- NANR
		System.out.println("10");
	}
	
	public static void printSum(int a,int b) {
		  // method - with arguments and no return value- WANR
		System.out.println("print sum of twe integr:" + (a+b));
	}
	
	public static String returnNum() { // method - no arguments and with return value- NAWR
		return "10";
	}
	
	public static int returnprintSum(int a,int b) { // method - with arguments and with return value- WAWR
		return + a+b ;
	}
	public static void main(String[] args) {
		System.out.println("main");
		printNum();
//		printHello(10); // CE 
		printSum(10,15);
		
//		printHelloWithName(); // CE		
		String output =returnNum();
		System.out.println(output);
		int output2 = returnprintSum(10,15); 
		System.out.println(output2);

	}

}
