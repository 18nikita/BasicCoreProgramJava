package com.bridgelabz.basiccore;

import java.util.Scanner;

public class QuotientAndReminder {

	public static void main(String[] args) {
		// UC-6-Find Quotient And Reminder
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter divident ");
		int divident = scanner.nextInt();

		System.out.println("Enter divisor ");
		int divisor = scanner.nextInt();

		int quotient = divident / divisor;
		int remainder = divident % divisor;

		System.out.println("The quotient is " + quotient);
		System.out.println("The remainder is " + remainder);

	}

}
