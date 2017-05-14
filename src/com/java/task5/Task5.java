package com.java.task5;

import java.util.Scanner;

/*
 * Now instead of just looking for the character 'e'. 
 * Make sure that you modify your code to count for any  character provided by the user as input 
 */
public class Task5 {

	private String s;

	public Task5(String s) {
		this.s = s;
	}

	private int take() {
//TOOK A SCANNER JUST TO MAKE USER INPUT A CHARACTER WHICH HAS TO CHECK FOR REPETITION
		Scanner sca = new Scanner(System.in);
		System.out.println("enter a character");
		// Here even though we give a string I set in such a  way that it takes only one first character
		char ch = sca.next().charAt(0);
		System.out.println(ch);
		String str = getS().toLowerCase();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ch) {
				count++;
			}
		}
		// I am returning the value here to who called me
		return count;
	}

	// using getter
	String getS() {
		return s;
	}

	// to convert tostring
	public String toString() {
		return "Task5 [s=" + s + "]";
	}

	// using setter to set desired string
	private void setS(String s) {
		this.s = s;
	}

	public static void main(String[] args) {

		// Let the value set in constructor be hard coded
		Task5 t5 = new Task5("AccidEntally prEssed print screen");
		System.out.println(t5.toString());
		// this value set using setter should be user input
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the string");
		String s11 = s1.next();
		// using setter to get the string
		t5.setS(s11);
		System.out.println(t5.toString());
		System.out.println(t5.take());

		s1.close();
	}

}
