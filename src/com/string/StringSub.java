package com.string;

public class StringSub {

	public static void main(String[] args) {
		String s= "sa";
		for(int i=0;i<s.length();i++)
		{
			  char ch = s.charAt(i);
			String substr=s.substring(0,1) + s.substring(1+ 1); 
			  
			System.out.println( substr);
		}
		
		
		

	}

}
