package com.LogicTask;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
	

	public static void main(String[] args) {
		int [] [] test=new int[][] {{1,2,3,4,5,6,1,2},{1,9,8,7,6,1,2,3,4},{1,2,7,8,9,4,3,6,5}};
		for( int[] input:test)
		{
			System.out.println("Initial array elements::" +Arrays.toString(input));
		System.out.println("After removing duplicate::" +Arrays.toString(removeDuplicates(input)));
		}
	}

	private static int[] removeDuplicates(int[] numberWithDupliicates) {
		int i,ch = 0;
		Arrays.sort(numberWithDupliicates);
		int [] result=new int [numberWithDupliicates.length];
		int previous = numberWithDupliicates[0];
		result[0]=previous;
		for( i=1;i<numberWithDupliicates.length;i++)
		{
			  ch = numberWithDupliicates[i];
		if(previous!=ch)
		{
			result[i]=ch;
		}
	
	previous=ch;
	}
		return result;
	
}
}
