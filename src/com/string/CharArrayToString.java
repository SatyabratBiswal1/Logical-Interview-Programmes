package com.string;

public class CharArrayToString {

	public static void main(String[] args) {
		char []chars={'s','a','t','y','a','b','r','a','t'};
		String string =String.copyValueOf(chars);
		System.out.println(string);

	}

}
