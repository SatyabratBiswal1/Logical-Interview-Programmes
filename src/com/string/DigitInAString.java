package com.string;

import java.util.Scanner;

public class DigitInAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something");
		String s = sc.next();
		char []chars=s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c:chars)
		{
			if(Character.isDigit(c))
			{
				sb.append(c);
				
			}
		}
		System.out.println(sb);

	}

}
