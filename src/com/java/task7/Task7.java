package com.java.task7;

import java.util.Scanner;

/*
 * Instead of creating same variable from the class, create a POJO class
 * Store the variable in setters of that POJO class
 * 
 * 
 * Make use of that POJO in task7 class
 * 
 * Main method is heavily loaded
 * 
 * Whatever logic that has been written inside main, move 
 * into a separate new method
 * 
 * 
 * From main, just call this method
 * 
 * Added JAVA Docs
 */
/**
 * @author 
 * @date 4/8/2017
 * @desc This project helps us finding repeated characters in the user input string. 
 * If a user enters y OR n DEPENDING ON THT THE PROCESS EITHER CONTINUES OR STOPS ARESPECTIVELY.
 */
public class Task7 {

	private PojoClass pojos = new PojoClass();

	/**
	 * 
	 * @return  returns count of the number occurances of a particular character
	 *
	 */

	private int countNumberOfCharacters() {
		// TOOK A SCANNER JUST TO MAKE USER INPUT A CHARACTER WHICH HAS TO CHECK
		// FOR REPETITION
		Scanner scannerInput = new Scanner(System.in);
		System.out.println("enter a character");
		// Here even though we give a string I set in such a way that it takes
		// only one first character
		char storeCharInput = scannerInput.next().charAt(0);
		System.out.println(storeCharInput);
		String stringLowerCase = pojos.getS().toLowerCase();
		int count = 0;

		for (int i = 0; i < stringLowerCase.length(); i++) {

			if (stringLowerCase.charAt(i) == storeCharInput) {

				count++;
			}
		}
		// I am returning the value here to who called me
		return count;
	}

	private void countAsPerUserInput() {
		System.out.println();
		System.out.println("Enter Y or N");

		Scanner inputUser = new Scanner(System.in);
		char inputReceived = inputUser.next().charAt(0);

		while ((inputReceived == 'Y') | (inputReceived == 'y')) {

			System.out.println("enter the string");
			String stringUserInput = inputUser.next();
			// using setter to get the string
			pojos.setS(stringUserInput);
			// System.out.println(t6.toString());
			System.out.println(countNumberOfCharacters());

			System.out.println("press Y if you still wana continue else N");

			inputReceived = inputUser.next().charAt(0);

			if ((inputReceived == 'N') | (inputReceived == 'n')) {
				break;

			}
		}

		System.out.println("no");

	}

	public static void main(String[] args) {

		// Let the value set in constructor be hard coded
		Task7 t7 = new Task7();
		t7.countAsPerUserInput();
	}
}