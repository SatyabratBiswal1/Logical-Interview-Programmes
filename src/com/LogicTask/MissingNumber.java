package com.LogicTask;

import java.util.Arrays;

/*the first procedure to do this by using formula of natural number
1+2+.......+n=(n+1)/2
And by using XOR operations 

so the first procedure we will do this by using a array with the formula with n*(n+1)/2
*/
public class MissingNumber {
	public static int GetMissingNumber(int arr[])
	{
		int n=arr.length+1;
		int total=n*(n+1)/2;
		int sum=Arrays.stream(arr).sum();
		
		return total-sum;
		
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,8,9};
		System.out.println("the missing number is:" +GetMissingNumber(arr));
		

	}

}
