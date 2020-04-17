package com.LogicTask;

import java.util.HashSet;

//Program to Check if product of every pairs exists in a given array

public class EveryPairExistInArray {

	 static boolean checkarray(int arr[],int n)
	{
		int zero=0, one=0 ,minusone=0, other=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
				zero++;
			if(arr[i]==1)
				one++;
			if(arr[i]== -1)
				minusone++;
			else
				other++;
		}
		if(other>1)
			return false;
		else if(other!=0 && minusone!=0)
			return false;
		else if(minusone>=1 && one ==0)
			return true;
			return false;
			
		
	}
		
	public static void main(String[] args) {
		int arr[]= {0,1,1,10,10,100};
		int n=arr.length;
		if(checkarray(arr, n))
			System.out.println("yse");
			else
				System.out.println("no");

	}

}
