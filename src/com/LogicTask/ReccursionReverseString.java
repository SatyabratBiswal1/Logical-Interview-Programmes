package com.LogicTask;

import java.util.Scanner;

public class ReccursionReverseString {
	
	private static String reverseString(String str) {
		if(str.isEmpty())
		{
			System.out.println("string is empty");
			return str;
		}
		System.out.println("string to call reccursivly::"+str.substring(0));
		return str.substring(1)+str.charAt(0);
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string ");
		String str=sc.next();
		String reversed= reverseString(str);
		System.out.println("the revere string is:: " +reversed);
				sc.close();

	}
	
}
