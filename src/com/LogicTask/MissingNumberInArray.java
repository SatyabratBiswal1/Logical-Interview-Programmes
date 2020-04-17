package com.LogicTask;

public class MissingNumberInArray {
	
	public static int MissingNum(int arr[])
	{
		int n=arr.length+1;
		int num=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			 sum=sum+arr[i];
		}
		int sol=num-sum;
		return sol;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7,8};
		System.out.println(MissingNum(arr));

	}

}
