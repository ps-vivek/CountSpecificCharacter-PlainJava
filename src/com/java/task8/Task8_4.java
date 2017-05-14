package com.java.task8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
 *
 *Except countNumberOfCharacters() keep all business
 *logic should be present in separate class
 *
 *
 */
public class Task8_4 {

	private PojoClass pojos = new PojoClass();
	private Scanner input;
	private BusinessLogicTask8_4 businessLogic = new BusinessLogicTask8_4();
	private InputLogicTask8_4 inputLogic = new InputLogicTask8_4();
	private List<String> innerList = null;
	private List<HashMap<Integer, List<String>>> outerList = new ArrayList<HashMap<Integer, List<String>>>();
	private HashMap<Integer, List<String>> innerMap = null;

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

	private List<HashMap<Integer, List<String>>> countNumberOfCharactersController() {
		System.out.println("Enter Y to Continue, N to Exit");
		input = new Scanner(System.in);

		char continueFlag = input.next().charAt(0);
		int count = 1;
		while ((continueFlag == 'Y') | (continueFlag == 'y')) {
			innerList = new ArrayList<String>();
			innerMap = new HashMap<Integer, List<String>>();

			System.out.println("Enter the input string:");
			pojos.setS(inputLogic.fetchStringInputs());
			System.out.println("Enter the character to be counted in the string:");
			pojos.setCharInput(inputLogic.fetchCharacterToCount());
			Integer output = businessLogic.mainCountLogic(pojos.getS(),
					pojos.getCharInput());
			innerList.add(pojos.getS());
			innerList.add(Character.toString(pojos.getCharInput()));
			innerList.add(Integer.toString(output));
			innerMap.put(count, innerList);
			count++;
			outerList.add(innerMap);
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

	public static void main(String[] args) {
		// Let the value set in constructor be hard coded
		Task8_4 t8 = new Task8_4();
		System.out.println(t8.countNumberOfCharactersController());
	}
}
