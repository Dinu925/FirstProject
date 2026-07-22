package com.flm2.conditional;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		
		int num = sc.nextInt();
		
		if(num % 5 == 0) {
			System.out.println("Divisible of 5");
		}else if (num % 2 == 0) {
			System.out.println("Divisible of 2");
		}else if (num % 3 == 0) {
			System.out.println("Divisible of 3");
		}else {
			System.out.println("Invalid");
		}

	}

}
