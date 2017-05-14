package com.java.task4;

import java.util.Scanner;

/*
 * Continuation from task3
 * 
 * 	Instead of hardcoding the input, retrieve the user input and store it in setter
 	Retrieve the variable from getters and make use of it

 */
public class Task4 {

	private String s;

	public Task4(String s) {
		this.s = s;
	}
	private int take() {

		String str = getS().toLowerCase();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'e') {
				count++;
			}
		}
		// I am returning the value here to who called me
		return count;
	}
	// using getter
	String getS() {
		return s;
	}
	// to convert tostring
	public String toString() {
		return "Task4 [s=" + s + "]";
	}

	// using setter to set desired string
	private void setS(String s) {
		this.s = s;
	}
	public static void main(String[] args) {

		// Let the value set in constructor be hard coded
		Task4 t4 = new Task4("AccidEntally prEssed print screen");
		System.out.println(t4.toString());
		// this value set using setter should be user input
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the string");
		String s11 = s1.next();
		// using setter to get the string
		t4.setS(s11);
		System.out.println(t4.toString());
		System.out.println(t4.take());

		s1.close();
	}

}
