package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FrequencyOfCharaters {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string or sentence ");
		String str=sc.nextLine();
		
		Integer []count=new Integer[str.length()];
	
		char[] a=str.toCharArray();
	
		for( int i=0;i<str.length();i++)
		{
			count[i]=1;
		
		for(int j=i+1;j<str.length();j++)
		{
			if(a[i]==a[j])
			{
				count[i]++;
		
				a[j]='0';
				
				}
			}
		}
	
		System.out.println("charactere frequency::");
		for(int i=0;i<count.length;i++)
		{
			if(a[i]!= ' ' && a[i]!='0')
				System.out.println(a[i] + " " + count[i]);
			
		}
			
	}

}
