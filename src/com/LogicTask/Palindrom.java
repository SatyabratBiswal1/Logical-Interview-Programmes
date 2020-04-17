package com.LogicTask;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sting");
		String input=sc.nextLine();
		System.out.printf("is %s a palindrom?: %d %n",input,isPalindrom(input));
		System.out.println("enter another string");
		 input = sc.nextLine();
		 System.out.printf("is %s palindrom ?: %d %n",input , isPalindrom(input));
		sc.close();

	}

	public static boolean isPalindrom(String input) {
		if (input==null || input.isEmpty())
		{
		return true;
		}
		StringBuilder sb = new StringBuilder();
		char[] array=input.toCharArray();
		for(int i=input.length()-1;i>=0;i--)
		{
			sb.append(array[i]);
		}
		String reverseOfString=sb.toString();
		return input.equals(reverseOfString);
		
	}


}
