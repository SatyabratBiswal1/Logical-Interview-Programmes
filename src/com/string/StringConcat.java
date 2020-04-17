package com.string;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		System.out.println("enter another string");
		String str1=sc.next();
		//str=str.concat(str1);
		System.out.println(str+ " " +str1);
	}

}
