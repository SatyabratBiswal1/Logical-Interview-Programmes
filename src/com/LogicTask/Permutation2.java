package com.LogicTask;

import java.util.Scanner;

public class Permutation2 {
	 
	 static void printPermutn(String str, String per) 
	    { 
	        if (str.length()==0)
	        { 
	            System.out.println(per + " "); 
	            return; 
	        } 
	  
	        for (int i = 0; i < str.length(); i++) { 
	  
	        	
	            char ch = str.charAt(i); 
	  
	            
	            String ros = str.substring(0, i) +  
	            str.substring(i + 1); 
	            
	            printPermutn(ros, per + ch);
	            
	        } 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("enyter a string");
	    	String s=sc.next();
	        printPermutn(s, ""); 
	    	
	    } 
}
