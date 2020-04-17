package com.LogicTask;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args) {
		int i,j,temp=0,count=0,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your term:");
		 n= sc.nextInt();
		
		for(i=1;n!=temp;i++)
		{
			count=0;
			for(j=1;j<=i/2;i++)
			{
			count++;	
			}
		if(count==1)
		{
			temp++;
		}
		if(n==temp)
		{
			System.out.println(i);
		}
		
	}

}
}
