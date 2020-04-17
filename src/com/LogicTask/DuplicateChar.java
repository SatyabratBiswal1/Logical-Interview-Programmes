package com.LogicTask;
import java.io.*;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;
public class DuplicateChar {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a string");
		//String str=br.readLine();7
		String str=sc.nextLine();
		int i,j,count;
		char [] ar=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			count=1;
			for(j=i+1;j<str.length();j++)
			{
				if(ar[i]==ar[j] && ar[i]!=' ')
				{
					//System.out.println(ar[j]);
					count++;
					ar[j]='0';
					
				}
			}
			if(count>1 && ar[i]!='0')
				System.out.println(ar[i]);
		}
	}
}
