package com.LogicTask;

import java.util.Arrays;

public class PrintPairSum2 {
	public static void printPairsUsingTwoPointers(int[] numbers, int k)
	{
		if(numbers.length < 2)
		{
			return; 
			} 
		Arrays.sort(numbers);
		int left = 0; int right = numbers.length -1; 
		while(left < right)
		{
			int sum = numbers[left] + numbers[right];
			if(sum == k)
			{ 
				System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
				left = left + 1; 
				right = right -1; }else if(sum < k)
				{
					left = left +1; 
					}
				else if (sum > k)
				{ 
					right = right -1; 
					} } }
	public static void prettyPrint(int[] random, int k)
	{
		System.out.println("input int array : " + Arrays.toString(random)); 
		System.out.println("All pairs in an array of integers whose sum is equal to a given value " + k); 
		printPairsUsingTwoPointers(random, k);
		} 

	public static void main(String[] args) {
		prettyPrint( new int[]{ 12, 14, 17, 15, 19, 20, -11}, 9);
	}

}
