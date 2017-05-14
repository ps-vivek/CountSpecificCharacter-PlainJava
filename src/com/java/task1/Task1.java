package com.java.task1;
/*
 * Task 1:
Count the number of e (Case insensitive) in the below input
Write a separate java method for performing this
Input: "AccidEntally prEssed print screen"
Output: 5 
Just print the output inside the method itself

No need of returning the output
Execute the function from main method. Create the method as static
 */
public class Task1 {

	//Static method
	static void findRepeatingNumbers(String s) {

		String str = s.toLowerCase();
		//Local variable
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) {		
		findRepeatingNumbers("AccidEntally prEssed print screen");
	}


}
