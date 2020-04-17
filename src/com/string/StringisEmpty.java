package com.string;

import java.util.Scanner;

public class StringisEmpty {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a string");
		String str=sc.next();
		if(str.length()==0 || str.isEmpty())
		{
			System.out.println("is empty");
			
		}
		else
		{
			System.out.println(str);
		}
		System.out.println("enter another string");
		String str2=sc.next();
		if(str2.length()==0 || str2.isEmpty())
		{
			System.out.println("is empty");
		}
		else
		{
			System.out.println(str2);
		}
	}

}
