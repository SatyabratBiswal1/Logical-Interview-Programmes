package com.string;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("enter a string: ");
		String str="satya brat biswal";
		String arr[]=str.split("\\s");
		for(String a:arr)
		{
			System.out.println(a);
		}
	}

}
