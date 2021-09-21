package com.bridgelabz.basiccore;

import java.util.Scanner;

public class HarmonicNo {

	public static void main(String[] args) {
		// UC-4-Harmonic number
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no.");
		int number=scanner.nextInt();
		
		double harmonicNumber = 0;
		for (double i = 1; i <= number; i++) {
			harmonicNumber = harmonicNumber + (1 / i);
		}
		System.out.println("n'th Harmonic Number of " + number + "" + harmonicNumber);
	}
}
