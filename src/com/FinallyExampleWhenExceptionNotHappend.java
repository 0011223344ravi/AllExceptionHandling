package com;

public class FinallyExampleWhenExceptionNotHappend {

	public static void main(String[] args) {
	 
		
		try {
			
			System.out.println("try block executed successfully");
		}
		catch (Exception e) {
			System.out.println("Catch block executed successfully");
		}
		
		finally {
			System.out.println("Finally block executed successfully");
		}

	}

}
