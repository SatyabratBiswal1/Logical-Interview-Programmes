package com.string;

public class NumberWithLeadingZero {

	public static void main(String[] args) {
		int number=1500;
		System.out.println(number);
		String FormatedStr =String.format("%010d", number);
		System.out.println("the leading zero is::" +FormatedStr);
		

	}

}
