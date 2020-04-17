package com.LogicTask;

import java.util.Scanner;

public class Palindrom2 {

	public static void main(String[] args) {
		String str,rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String Str=sc.next();
		  String string = new StringBuffer(Str).reverse().toString();
          if(Str.contains(string))
		       System.out.println("Palindarm");
          else
        	  System.out.println("Is Not Palindram");
		  
	}

}
