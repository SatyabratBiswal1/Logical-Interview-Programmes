package com.LogicTask;

import java.util.Scanner;

public class StringPalinDrom3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String str1=sb.toString();
		if(str.equals(str1))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}

	}

}
