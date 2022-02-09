package com.capgemini.sfdc.oop;

//inheritance - a subclass (child class) accesses members of superclass (parent class)
//acquire properties from parents 

class Parent {
	int num;
}

class Child extends Parent {
	int num2;
}
 class GrandChild extends  Parent
 {
	 int num3;
 }
public class InheritDemo {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.num2 = 20;
		System.out.println(ch.num2);
		ch.num = 10;
		System.out.println(ch.num);
		GrandChild gc=new GrandChild();
		gc.num3=80;
		System.out.println(gc.num3);
	}
}