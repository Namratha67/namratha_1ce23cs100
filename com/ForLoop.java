package com.datatypes;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size <=0) {
			System.out.println("Invalid Number");
		}
		for (int i = 1; i<= size; i++) {
			if(i % 2 == 0) {
				System.out.println(i + "even");
			}else {
				System.out.println(i + "odd");
			}
			sc.close();
		}
		
		

	}

}
