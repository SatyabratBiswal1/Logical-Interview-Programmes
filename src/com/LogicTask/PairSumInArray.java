package com.LogicTask;

import java.util.Arrays;

public class PairSumInArray {
	public static void PairSum(int arr[],int total)
	{
		
	for(int i=0;i<arr.length;i++)
	{
		int first=arr[i];
	
	for(int j=i+1;j<arr.length;j++)
	{
		int second=arr[j];
	
	if((first+second)==total)
	{
		System.out.println( first+""+second);
	}
	}
	}
	}
	public static void givenprint(int givenarr[],int giventotal)
	{
		System.out.println("given array=" +Arrays.toString(givenarr));
		System.out.println("giventotal="+giventotal);
		//System.out.println("Integer numbers, whose sum is equal to value : " + giventotal);
		PairSum(givenarr, giventotal);
	}

	public static void main(String[] args) {
		int number[]={2, 6, 3, 9, 11};
		//int total=9;
		givenprint(number,7);

	}

}
