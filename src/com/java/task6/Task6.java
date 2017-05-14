package com.java.task6;

import java.util.Scanner;

/*
 * Handle exceptions 
   The function should execute in a loop till the user enters "y" OR "Y"
   If the user enters a "n" OR "N", it should stop the execution of the function
 */
public class Task6 {

	private String s;

	public Task6(String s) {
		this.s = s;
	}

	private int take() {
		// TOOK A SCANNER JUST TO MAKE USER INPUT A CHARACTER WHICH HAS TO CHECK
		// FOR REPETITION
		Scanner sca = new Scanner(System.in);
		System.out.println("enter a character");
		// Here even though we give a string I set in such a way that it takes
		// only one first character
		char ch = sca.next().charAt(0);
		System.out.println(ch);

		String str = getS().toLowerCase();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ch) {

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
		return "Task6 [s=" + s + "]";
	}

	// using setter to set desired string
	private void setS(String s) {
		this.s = s;
	}

	public static void main(String[] args) {

		// Let the value set in constructor be hard coded
		Task6 t6 = new Task6("AccidEntally prEssed print screen");
		System.out.println();
		System.out.println("Enter Y or N");

		Scanner inputUser = new Scanner(System.in);
		char inputReceived = inputUser.next().charAt(0);

		while ((inputReceived == 'Y') | (inputReceived == 'y')) {
			// this value set using setter should be user input
			// Scanner s1 = new Scanner(System.in);
			// System.out.println("Entering death loop");

			System.out.println("enter the string");
			String s11 = inputUser.next();
			// using setter to get the string
			t6.setS(s11);
			// System.out.println(t6.toString());
			System.out.println(t6.take());

			System.out.println("press Y if you still wana continue else N");

			inputReceived = inputUser.next().charAt(0);

			if ((inputReceived == 'N') | (inputReceived == 'n')) {
				break;

			}
		}

		System.out.println("no");
	}
	// inputReceived = inputUser.next().charAt(0);

}
