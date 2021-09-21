package com.bridgelabz.basiccore;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// UC-8-Check no is odd or even
		
		Scanner scanner=new Scanner(System.in);
		int n = 0;
		System.out.println("Enter the no.");
		n=scanner.nextInt();
		if(n%2 ==0) {
			System.out.println("Entered no. is even");
		}
		else {
			System.out.println("Entered no. is odd");
		}
	}
}
