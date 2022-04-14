package com;

public class OrderOfCatchBlock {

	public static void main(String[] args) {
		 try{System.out.println(1/0);}
		 catch(Exception e ) {
			 
		 }
			/*
			 * catch(ArithmeticException ex) {
			 * 
			 * }
			 */

	}
	
	

}

//note :- child exception should come first
//you can see in OrderOfCatchBlock1 class.