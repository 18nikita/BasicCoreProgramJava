package com.bridgelabz.basiccore;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// UC-5-Prime Factor
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=scanner.nextInt();
		
		for(int i=2; i<n; i++) {
			while(n%i==0) {
				System.out.println(i);
				n=n/i;
				}
			}
		if(n>2) {
			System.out.println(n);
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

