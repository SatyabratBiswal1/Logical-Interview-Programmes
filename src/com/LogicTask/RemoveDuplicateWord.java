package com.LogicTask;

import java.util.Scanner;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String ar[] = str.split(" ");
		for( i=0;i<ar.length;i++)
		{
			if(ar[i]!=null)
			{
				for(j=i+1;j<ar.length;j++)
				{
					if(ar[i].equals(ar[j]))
					{
						ar[j]=null;
					}
				}
			}
			
		}
		for(k=0;k<ar.length;k++)
		{
			if(ar[k]!=null)
			{
				System.out.println(ar[k]);
			}
		}

	}

}
