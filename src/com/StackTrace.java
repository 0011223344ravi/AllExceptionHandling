package com;

public class StackTrace {

	public static void main(String[] args) {
		doStuf();
	}

	private static void doStuf() {
		 doMoreStuf();
		
	}

	private static void doMoreStuf() {
		System.out.println(1/0);
	}
	

}
