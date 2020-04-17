package com.LogicTask;

import java.util.Scanner;

public class ArrayContainsAnyValue {

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		int temp=0;
		System.out.println("enter a number");
		int a=sc.nextInt();
		
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=a;
		 temp=arr[i];
		if(a==temp)
		{
			System.out.println("the element is present");
		}
		else
		{
			System.out.println("not present");
		}
		break;
		
		}
	}                     

}
