package com.bridgelabz.basiccore;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		// UC-7-Swap number
			//variables
		   int a=0, b=0, c=0;
		   
	       Scanner scanner = new Scanner(System.in);  
	       System.out.println("Enter the value of a and b");  
	       a = scanner.nextInt();  
	       b = scanner.nextInt();  
	       
	       System.out.println("before swapping numbers: "+a +"  "+ b);  
	       // swapping   
	       c = a;  
	       a = b;  
	       b = c;  
	       System.out.println("After swapping: "+a +"   " + b);  
	       System.out.println( );  

	}

}
