package com.capgemini.sfdc.oop;

// Encapsulation - bind data (fields / variables) and code (methods) together 
// create private fields and create public methods (getters and setters) to access those fields 
class employee{
	private int emplyeeId;
	private String firstName;
	private double salary;
	public int getEmplyeeId() {
		return emplyeeId;
	}
	public void setEmplyeeId(int emplyeeId) {
		this.emplyeeId = emplyeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}


class BankCustomer {

	private double balance;
	// other fields

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

}

public class EncapDemo {

	public static void main(String[] args) {
		BankCustomer customer1 = new BankCustomer();
		customer1.deposit(1000);
		System.out.println(customer1.getBalance());
		customer1.withdraw(600);
		System.out.println(customer1.getBalance());
//		customer1.balance = 1500; // not allowed
		System.out.println(customer1.getBalance());
	}
}
