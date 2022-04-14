package com;
import java.lang.*;

public class ThrowExample2 {
	
	static ArithmeticException e = new ArithmeticException();

	public static void main(String[] args) {
	 
        throw e;
	}

}
