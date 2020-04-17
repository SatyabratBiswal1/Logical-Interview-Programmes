package com.LogicTask;

import java.util.HashSet;

//Given an Array A[] and a number X ,check for pair in Array a[] with sum of x

public class CheckaArrayWithSumOfX {
	public static void checkpair(int arr[],int sum)
	{
		int i;
		int temp=0;
		HashSet<Integer> s= new HashSet<Integer>();
		for( i=0;i<arr.length;++i)
		 temp=sum-arr[i];
		if(s.contains(temp));
		{
			System.out.println("pairs::" +sum+" " +arr[i] +" " +temp);
		}
		s.add(arr[i]);
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,6,10};
		int n=16;
		checkpair(a,n);

	}

}
