package com.java.task9;
/*
 * Add constructor(default, 2 parameter)
 * 
 * Add toString() method
 * 
 * Add equals() & hashcode() method
 */
public class CountInput {

	private String stringInput;
	private char charInput;

	CountInput() {
	}

	CountInput(String stringInput, char charInput) {
		super();
		this.stringInput = stringInput;
		this.charInput = charInput;
	}

	char getCharInput() {
		return charInput;
	}

	void setCharInput(char charInput) {
		this.charInput = charInput;
	}

	String getS() {
		return stringInput;
	}

	void setS(String s) {
		this.stringInput = s;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + charInput;
		result = prime * result
				+ ((stringInput == null) ? 0 : stringInput.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountInput other = (CountInput) obj;
		if (charInput != other.charInput)
			return false;
		if (stringInput == null) {
			if (other.stringInput != null)
				return false;
		} else if (!stringInput.equals(other.stringInput))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CountInput [stringInput=" + stringInput + ", charInput="
				+ charInput + "]";
	}



}
