package com.capgemini.sfdc.day2;

class BankCustomer{
	static String ifsc;
	int acNo;
	String custmoerName;
	double balance;
	
}

public class DemoClass {
	public static void main(String[] args) {
		BankCustomer.ifsc="B0B0001245"; //access static member with class name
		System.out.println(BankCustomer.ifsc);
		BankCustomer obj=new BankCustomer(); //access nonstatic member with obj name
		obj.acNo=521347867;
		System.out.println(obj.acNo);
		
	}

}
