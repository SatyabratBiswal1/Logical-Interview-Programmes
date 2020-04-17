package com.LogicTask;

import java.util.Scanner;

public class NthPrime {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter nth term : ");
	    int n = sc.nextInt(); 
	    int temp=1, count=0, i;
	   
	    while (count < n)
	    {
	      temp=temp+1;
	      for (i = 2; i <= temp; i++)
	      { 
	        if (temp % i == 0) 
	        {
	          break;
	        }
	      }
	      if ( i == temp)
	      {
	        count = count+1;
	      }
	    }
	    System.out.println("Value of nth prime: " + temp);
	  }
	}
