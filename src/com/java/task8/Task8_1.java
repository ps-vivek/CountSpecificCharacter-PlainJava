package com.java.task8;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Rewrite the string logic using hashmap
 * 
 * created separate methods for fetching inputs, business logic. Implemented the core logic to be executed 
 * multiple times
 */
public class Task8_1 {

	private PojoClass pojos = new PojoClass();
	private Scanner input;

	/**
	 * 
	 * @return returns count of the number of occurrences of a particular
	 *         character
	 * 
	 */
	private void countNumberOfCharacters() {
		System.out.println("Enter Y to Continue, N to Exit");
		input = new Scanner(System.in);
		
		char continueFlag = input.next().charAt(0);

		while ((continueFlag == 'Y') | (continueFlag == 'y')) {

			System.out.println("Enter the input string:");
			pojos.setS(fetchStringInputs());
			
			System.out.println("Enter the character to be counted in the string:");
			char userCharcToSearch = fetchCharacterToCount();
			
			System.out.println("Count Value:"+mainCountLogic(pojos.getS(), userCharcToSearch));
			System.out.println("Enter Y to Continue, N to Exit");
			
			continueFlag = input.next().charAt(0);
			if ((continueFlag == 'N') | (continueFlag == 'n')) {
				break;
			}
		}
		System.out.println("End of Program");
		input.close();
	}
	
	
	private Integer mainCountLogic(String userInput, char userCharcToSearch)
	{
		userInput = userInput.toLowerCase();
		
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < userInput.length(); i++) {
			if (hashmap.containsKey(userInput.charAt(i))) {
				int value = hashmap.get(userInput.charAt(i));
				value++;
				hashmap.put(userInput.charAt(i), value);
			} 
			else {
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
		System.out.println("Entered here");
		char storeCharInput = input.next().charAt(0);
		return storeCharInput;
	}

	public static void main(String[] args) {
		// Let the value set in constructor be hard coded
		Task8_1 t8 = new Task8_1();
		t8.countNumberOfCharacters();
	}
}
