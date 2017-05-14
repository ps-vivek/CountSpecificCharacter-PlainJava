package com.java.task3;

/*
 * Continuation from task2	
 * 
 * Now initialize the class variable using setters and getters
   Add toString() method
   Now make use of the setter method to retrieve the variable for performing your operations
 */
public class Task3 {

	private String s;

	public Task3(String s) {
		this.s = s;
	}

	private int take() {

		String str = getS().toLowerCase();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'e') {
				count++;
			}
		}

		// I am returning the value here to who called me
		return count;
	}

	// using getter
	private String getS() {
		return s;
	}

	// to convert tostring
	public String toString() {
		return "Task3 [s=" + s + "]";
	}

	// using setter to set desired string
	private void setS(String s) {
		this.s = s;
	}

	public static void main(String[] args) {

		Task3 t3 = new Task3("AccidEntally prEssed print screen");
		System.out.println(t3.toString());
		t3.setS("BrowniE");
		System.out.println(t3);
		System.out.println(t3.toString());
		System.out.println(t3.take());

	}
}
