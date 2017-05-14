package com.java.task8;

import java.util.Scanner;

public class InputLogicTask8_4 {
	
	private Scanner input;
	
	public String fetchStringInputs() {
		input = new Scanner(System.in);
		String stringUserInput = input.next();
		return stringUserInput;
	}

	 public char fetchCharacterToCount() {
		input = new Scanner(System.in);
		char storeCharInput = input.next().charAt(0);
		return storeCharInput;
	}
}
