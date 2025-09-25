package com.datatypes;

import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int x;
		x=sc.nextInt();
		if(x==0) {
			System.out.println("the given number: "+x+" is zero");
		}else if(x<0) {
			System.out.println("the given number is: "+x+" is -ve");
		}else if(x%2==0) {
			System.out.println("the given number is: "+x+" is +ve");
		}else {
			System.out.println("the given number is: "+x+" is odd");
		}
		sc .close();
				
			
		}
		
}


