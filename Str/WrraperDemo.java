package com.capgemini.sfdc.str;

// wrapper classes 
// int - Integer
// byte - Byte
// char - Character 


public class WrraperDemo {

	public static void main(String[] args) {

//		String str = "abc";
////		str.
//		int num = 10;
////		num.

//		Integer num = 10;
//		System.out.println(num.intValue());

		String str = "100";
		String str2 = "200";
		String str3;

		int num1 = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		int num3 = num1 + num2;
		str3 = Integer.toString(num3);
		System.out.println(str3);
		
		
		byte a=12;
		byte b=13;
        System.out.println(Byte.valueOf(b));
        
        Integer x=new Integer(3);    
        int i=x.intValue();  
        int j=x;   
            
        System.out.println(x+" "+i+" "+j);   
        
        int p=20;  
        Integer q=Integer.valueOf(p);
        Integer r=p;
          
        System.out.println(p+" "+q+" "+r);  

	}

}