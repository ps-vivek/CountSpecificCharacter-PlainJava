package com.java.task9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 *Reading the input contents from a file
 *Writing the output to a file
 */
public class CountCharacterController extends CountControllerBase {

	private CountInput pojos = null;
	private BusinessLogicTask businessLogic = new BusinessLogicTask();
	private List<String> innerList = null;
	private List<HashMap<Integer, List<String>>> outerList = new ArrayList<HashMap<Integer, List<String>>>();
	private HashMap<Integer, List<String>> innerMap = null;


	/**
	 * @return returns count of the number of occurrences of a particular
	 *         character
	 */

	private List<HashMap<Integer, List<String>>> countNumberOfCharactersController() {
		pojos = new CountInput();
		List<List<String>> inputList = toFetchInputFromFile();
		Integer output = 0;
		int count = 1;
		
		for (List<String> eachElement : inputList) {
			int tempCount = 1;
			innerList = new ArrayList<String>();
			innerMap = new HashMap<Integer, List<String>>();

			for (String eachString : eachElement) {
				if (tempCount == 1) {
					pojos.setS(eachString);
				} else {
					pojos.setCharInput(eachString.charAt(0));
				}
				tempCount++;
			}
			
			output = businessLogic.mainCountLogic(pojos.getS(),
					pojos.getCharInput());
			innerList.add(pojos.getS());
			innerList.add(Character.toString(pojos.getCharInput()));
			
			try {
				innerList.add(Integer.toString(output));
			} catch (NullPointerException e) {
				System.out.println("Got a null pointer value for count" + e + 
						" Input:"+pojos.getS()+" ,Char to search:"+pojos.getCharInput());
				innerList.add("0");
				//throw new NullPointerException("Expecting an integer for output. Got null value" + e);
			} 
			innerMap.put(count++, innerList);
			
			outerList.add(innerMap);
		}
		//Writing the output to file
		writeOutputTOfile(outerList);
		return outerList;

	}

	public static void main(String[] args) {
		CountCharacterController t8 = new CountCharacterController();
		System.out.println(t8.countNumberOfCharactersController());

	}
}