package com.LogicTask;

public class DuplicateInArray {
	public static int FindDup(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
			for(int j=i+1 ;j<arr.length;j++)
				if(arr[i]==arr[j]&& i!=j)
				{
					System.out.println(arr[i]+"");
				}
				
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,1,2,4,5};
		FindDup(arr);
	}

}
