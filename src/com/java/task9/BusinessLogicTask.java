package com.java.task9;
/*
 *
 * Instead of reading the value from user directly.
 * Read the value from a text file
 * Write the output to the table
 *
 */
import java.util.HashMap;

public class BusinessLogicTask {

	Integer mainCountLogic(String userInput, char userCharcToSearch) {
		userInput = userInput.toLowerCase();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

		for (int i = 0; i < userInput.length(); i++) {
			if (hashmap.containsKey(userInput.charAt(i))) {
				hashmap.put(userInput.charAt(i), hashmap.get(userInput.charAt(i)) +1 ) ;
			} else {
				hashmap.put(userInput.charAt(i), 1);
			}
		}
		
		return (hashmap.get(userCharcToSearch));
	}
}
