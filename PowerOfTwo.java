package com.bridgelabz.basiccore;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// UC-3-Power of two
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no.");
		int num = scanner.nextInt();

		int i = 0, total;

		if (num >=0) {
			while (i <= num && i < 31) {
				total = (int) Math.pow(2, i);
				System.out.println("2^" + i + ":" + total);
				i++;
			}
		} if (i >=31) {
			System.out.println("you passed wrong value");
			
		}
	}
}
