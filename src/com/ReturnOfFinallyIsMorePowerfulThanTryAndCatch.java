package com;

public class ReturnOfFinallyIsMorePowerfulThanTryAndCatch {

	public static void main(String[] args) {
		System.out.println(m1());
	}
	
	public static int m1() {
		
		try {
			 
			System.out.println("try block executed successfully");
			return 666;
		}
		catch (NullPointerException e) {
			System.out.println("Catch block executed successfully");
			return 777;
		}
		
		finally {
			System.out.println("Finally block executed successfully");
			return 888;
		}

	}
	}
