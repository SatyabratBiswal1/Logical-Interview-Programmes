package com.string;

import java.util.Scanner;

public class StringEquals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str1=sc.next();
		System.out.println("enter another String");
		String Str2=sc.next();
		System.out.println(str1.equals(Str2));
	}

}
