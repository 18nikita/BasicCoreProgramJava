package com.bridgelabz.basiccore;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// UC-1-FlipCoin
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of coin to toss");
		int numberOfFlips=scanner.nextInt();
		
		double head = 0, headpercent = 0;
		for (int i = 0; i < numberOfFlips; i++) {
			double side = Math.random();
			if (side > 0.5) {
				head++;
			}
			headpercent = head * 100 / numberOfFlips;
			System.out.println("Percentage of Head= " + headpercent);
			System.out.println("Percentage of Tail= " + (100 - headpercent));
		}
	}
}
