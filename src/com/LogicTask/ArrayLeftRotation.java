package com.LogicTask;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		System.out.println("onital array elements::" +al);
		
		Collections.rotate(al, 1);
		System.out.println(al);

	}

}
