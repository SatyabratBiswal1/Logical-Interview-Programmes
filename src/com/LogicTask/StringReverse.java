package com.LogicTask;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());
		sc.close();
		
	}

}
