package com;

public class ThrowExample1 {

	public static void main(String[] args) {
		 
       try {
    	   m1();
	} catch (ArithmeticException e) {
		 System.out.println("caught the exeption");
	}
	}
	
	public static void m1() {
		
   throw new ArithmeticException("/ by zero");
	}

}
