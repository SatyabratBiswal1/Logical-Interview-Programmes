package com.LogicTask;

//write a program to Find A Pair whose sum is equal to a given number

public class PairSumEqualToANumber {
	public static void getpaircount(int arr[],int sum)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length;j++)
				if(arr[i]+arr[j]==sum)
					count++;
		System.out.println("the pair is " +count);
	}
	public static void main(String args[])
	{
		int arr[]= {7,-1,6,8};
		int sum=7;
		getpaircount(arr,sum);
	}
	

}
