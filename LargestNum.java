package com.bridgelabz.basiccore;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// UC-10-Find largest no among 3 numbers
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter any three no.");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		
		if(n1 > n2 && n1 > n3)
        {
            System.out.println("Largest number is:" +n1);
        }
        else if(n2 > n3)
        {
            System.out.println("Largest number is:"+n2);
        }
        else
        {
            System.out.println("Largest number is:"+n3);
        }
	}
}
