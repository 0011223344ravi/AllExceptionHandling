package com;

public class FinallyExampleWhenCatchDoesNotMatched {

	public static void main(String[] args) {
		try {
			System.out.println(1/0);
			System.out.println("try block executed successfully");
		}
		catch (NullPointerException e) {
			System.out.println("Catch block executed successfully");
		}
		
		finally {
			System.out.println("Finally block executed successfully");
		}

	}

}
