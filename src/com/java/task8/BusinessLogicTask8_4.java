package com.java.task8;

import java.util.HashMap;

public class BusinessLogicTask8_4 {

	Integer mainCountLogic(String userInput, char userCharcToSearch) {
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
}
