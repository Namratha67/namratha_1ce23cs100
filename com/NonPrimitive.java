package com.datatypes;

import java.util.Arrays;

public class NonPrimitive {

	public static void main(String[] args) {
		String name ="pavan";
		System.out.println("Your name:" +name);
		int[] arr= {2,3,4,5};
		System.out.println("Your marks: "+Arrays.toString(arr));
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}

	}

}
