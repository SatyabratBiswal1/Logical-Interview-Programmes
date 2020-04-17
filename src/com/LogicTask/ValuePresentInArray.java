package com.LogicTask;

public class ValuePresentInArray {
	public static boolean Target(int arr[] ,int target)
	{
		for(int ele:arr)
			if(ele==target)
			{
				System.out.println("yes element is there::="+target);
			}
		return false;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int target=1;
		Target(arr,target);

	}

}
