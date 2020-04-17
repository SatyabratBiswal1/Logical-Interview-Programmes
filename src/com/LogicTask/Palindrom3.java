package com.LogicTask;

import java.util.Scanner;

public class Palindrom3 {

	public static void main(String[] args) {
		String Str,rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string:");
		 Str=sc.next();
		 for(int i=Str.length()-1;i>=0;i--)
			 rev=rev+Str.charAt(i);
		 if(rev.equals(Str))
			 System.out.println(Str+" : is palindrom");
		 else
			 System.out.println(Str+" : is not palindrom );                                           not palindrom");
		          
		
	}

}
