package com;

public class ThrowExample4 {

	public static void main(String[] args) {
		System.out.println("statement1");
		throw new ArithmeticException();
	//	System.out.println("statement2");

	}

}

//can't take any statement after throw , otherwise will get compile time error
