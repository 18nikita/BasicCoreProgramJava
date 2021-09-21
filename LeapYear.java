package com.bridgelabz.basiccore;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// UC-2-Leap Year
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year");
		int year=scanner.nextInt();
		
		if(year%4==0 && year%400==0 || year%100==0) {
			System.out.println(year+" "+"year is leap year");
		}
		else {
			System.out.println(year +" "+ "year is not a leap year");
		}
	}
}
