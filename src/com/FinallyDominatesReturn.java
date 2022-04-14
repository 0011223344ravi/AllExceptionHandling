package com;

public class FinallyDominatesReturn {

	public static void main(String[] args) {
		try {
			
			System.out.println("try block executed successfully");
			 return;
		}
		catch (NullPointerException e) {
			System.out.println("Catch block executed successfully");
		}
		
		finally {
			System.out.println("Finally block executed successfully");
		}

	}

}
//finally is executed in all the condition