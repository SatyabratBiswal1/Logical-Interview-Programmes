package com.LogicTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class ReverseByWord {
	public static void main (String args[]) throws IOException
	{
		/*String s="Industry Development And Training In Word Buzz A , Technologies I Naresh";
		 StringTokenizer st = new StringTokenizer(s);
		String reverse="";
		while(st.hasMoreTokens())
		{
			reverse=st.nextToken() + " " + reverse;
		}
		System.out.println(reverse);
		
	*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a string");
		String s= br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		String reverse="";
		while(st.hasMoreTokens())
		{
			reverse=st.nextToken() + " " + reverse;
		}
		System.out.println(reverse);
		
		
	}
	                                                                                            
		

}
	
