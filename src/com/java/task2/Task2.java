package com.java.task2;

/*
 * Continuation from Task1 
 * 
 • Change the method as non static
 • Instead of initializing the input inside a method.
 • Create a class variable
 • Initialize that variable using constructor
 • Make use of that variable inside the method
 Return the output value and print it from main 
 */
public class Task2 {

	private String s;

	public Task2(String s) {
		this.s = s;
	}

	private int take() {

		String str = s.toLowerCase();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				count++;
			}
		}
		// I am returning the value here to who called me
		return count;
	}

	public static void main(String args[]) {
		Task2 first = new Task2("AccidEntally prEssed print screen");
		// I called and I will get the value
		System.out.println(first.take());

	}

}
