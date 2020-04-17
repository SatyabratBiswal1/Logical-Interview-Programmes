package com.string;

public class CheckStringSequence {
	String checkstring(String str)
	{
		return str.concat(str);
	}

	public static void main(String[] args) {
		
		CheckStringSequence s=new CheckStringSequence();
		s.checkstring("satyabrat");
	}

}
