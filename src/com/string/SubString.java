package com.string;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String Str=sc.next();
		System.out.println(Str.substring(2,4));
		System.out.println(Str.substring(2));
		System.out.println(Str.substring(3));

	}

}
