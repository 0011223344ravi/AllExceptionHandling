package com;

public class WhenFinallyNotExecuted {

	public static void main(String[] args) {
		try {
			 
			System.out.println("try block executed successfully");
			  System.exit(0);
		}
		catch (NullPointerException e) {
			System.out.println("Catch block executed successfully");
		}
		
		finally {
			System.out.println("Finally block executed successfully");
		}

	}

	}


