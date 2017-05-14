package com.java.task8;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Rewrite the string logic using hashmap
 */
public class Task8 {

	private PojoClass pojos = new PojoClass();

	/**
	 * 
	 * @return returns count of the number occurances of a particular character
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

		// Make use of a hashmap
		// iterate string
		// Create key value pair based on the entries
		// the map should return the value associated with the storeCharInput
		// key

		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		//
		for (int i = 0; i < stringLowerCase.length(); i++) {
			if (hashmap.containsKey(stringLowerCase.charAt(i))) {
				int valueFetch = hashmap.get(stringLowerCase.charAt(i));

				valueFetch++;
				hashmap.put(stringLowerCase.charAt(i), valueFetch);

			} else {

				hashmap.put(stringLowerCase.charAt(i), 1);

			}

		}

		return hashmap.get(storeCharInput);
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
		Task8 t8 = new Task8();
		t8.countAsPerUserInput();
	}
}
