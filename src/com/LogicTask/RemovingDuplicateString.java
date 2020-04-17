package com.LogicTask;

import java.util.Scanner;
import java.util.*;

public class RemovingDuplicateString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str1=sc.next();
		char c[]=str1.toCharArray();
		String r="";
		for(char s:c)
		
			if(r.indexOf(s)== -1)
			{
				r+=s;
				
			}
			System.out.println(r);
		
		
		
		
		

	}

}
