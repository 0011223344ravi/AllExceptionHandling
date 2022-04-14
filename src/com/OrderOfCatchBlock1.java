package com;

public class OrderOfCatchBlock1 {

	public static void main(String[] args) {
		 try{System.out.println(1/0);}
		 
		 catch(ArithmeticException ex) {
			ex.printStackTrace(); 
		 }
		 catch(Exception e ) {
			 
		 }
			 
		 
		 
	}
	}


