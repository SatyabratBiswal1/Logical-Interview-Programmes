package com.string;

public class StringReplace {

	public static void main(String[] args) {
		String Str="oooo-hhhh-oooo";
		String rs=Str.replace("h","s");
		System.out.println(rs);
		rs=rs.replace("s", "h");
		System.out.println(rs);
		
	}

}
