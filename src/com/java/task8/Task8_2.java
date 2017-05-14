package com.java.task8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
 *Add the value of userCharcToSearch in POJO using setters & getters
 *Return the output in the innerList of lists
 *
 *Example:
 *Input String: cleiii  , Char to search:i
 *Input String: viveevv  , Char to search:v
 *
 *Output should be like this:  ( ('cleiii','i','3') , ('viveevv','v','4') )
 *
 *
 *Return list of list as the output for the method
 *
 */
public class Task8_2 {

	private PojoClass pojos = new PojoClass();
	private Scanner input;

	private List<String> innerList = null;
	private List<List<String>> outerList = new ArrayList<List<String>>();

	/**
	 * 
	 * @return returns count of the number of occurrences of a particular
	 *         character
	 * 
	 *         Created an inner list which is a List of strings containing
	 *         string input, char input and count input
	 * 
	 *         Created an outer list to add list containing inputs, list inside
	 *         list
	 * 
	 *         Declared inner list inside the methods for every list creation
	 *         new values are added and saved in Outer list which is being
	 *         declared as instance variable
	 * 
	 * 
	 * 
	 */

	private List<List<String>> countNumberOfCharacters() {
		System.out.println("Enter Y to Continue, N to Exit");
		input = new Scanner(System.in);

		char continueFlag = input.next().charAt(0);

		while ((continueFlag == 'Y') | (continueFlag == 'y')) {
			innerList = new ArrayList<String>();
			System.out.println("Enter the input string:");
			pojos.setS(fetchStringInputs());

			System.out.println("Enter the character to be counted in the string:");

			pojos.setCharInput(fetchCharacterToCount());

			Integer output = mainCountLogic(pojos.getS(), pojos.getCharInput());

			innerList.add(pojos.getS());
			innerList.add(Character.toString(pojos.getCharInput()));
			innerList.add(Integer.toString(output));

			// System.out.println(innerList);

			outerList.add(innerList);
			// System.out.println(outerList);

			System.out.println("Enter Y to Continue, N to Exit");

			continueFlag = input.next().charAt(0);
			if ((continueFlag == 'N') | (continueFlag == 'n')) {
				break;
			}
		}
		System.out.println("End of Program");
		input.close();
		return outerList;
	}

	private Integer mainCountLogic(String userInput, char userCharcToSearch) {
		userInput = userInput.toLowerCase();

		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

		for (int i = 0; i < userInput.length(); i++) {
			if (hashmap.containsKey(userInput.charAt(i))) {
				int value = hashmap.get(userInput.charAt(i));
				value++;
				hashmap.put(userInput.charAt(i), value);
			} else {
				hashmap.put(userInput.charAt(i), 1);
			}
		}
		return (hashmap.get(userCharcToSearch));
	}

	private String fetchStringInputs() {
		input = new Scanner(System.in);
		String stringUserInput = input.next();
		return stringUserInput;
	}

	private char fetchCharacterToCount() {
		input = new Scanner(System.in);
		char storeCharInput = input.next().charAt(0);
		return storeCharInput;
	}

	public static void main(String[] args) {
		// Let the value set in constructor be hard coded
		Task8_2 t8 = new Task8_2();
		System.out.println(t8.countNumberOfCharacters());
	}
}
