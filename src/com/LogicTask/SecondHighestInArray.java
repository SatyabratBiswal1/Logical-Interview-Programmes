package com.LogicTask;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestInArray {
	static int a[]=new int[5];
	static int i;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array elemnts");
		
		for( i=0;i<a.length;i++)
			a[i]=sc.nextInt();
			Arrays.sort(a);
			//for(i=0;i<a.length;i++)
				System.out.println("2nd smallest::" +a[1]);
				System.out.print( "2nd highest ::");
				System.out.println(a.length-1);
	
		
		

	}

}
