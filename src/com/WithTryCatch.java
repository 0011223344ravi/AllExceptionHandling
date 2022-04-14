package com;

public class WithTryCatch {

	public static void main(String[] args) {
		 
	    System.out.println("statement1");
	    try {
	    System.out.println(1/0);
	    }
	    catch(ArithmeticException e) {
	    e.printStackTrace();
	     
	    e.getMessage();
	    
	    e.getClass();
	    }
	    System.out.println("statement2");

	}

}
