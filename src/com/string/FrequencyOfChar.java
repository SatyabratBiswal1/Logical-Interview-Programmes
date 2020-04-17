package com.string;

public class FrequencyOfChar {

	public static void main(String[] args) {
		String str="satyabrat biswal";
		int count =0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)=='a')
			{
				count++;
			}
		}
		System.out.println("frequency of a::" +count);

	}

}
