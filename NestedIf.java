package com.flm2.conditional;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		System.out.print("Enter Age :");
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if(age >18) {
			System.out.print("Do you have valid License?");
			String hasLicense = sc.next();
			
			if(hasLicense.equals("Yes")) {
				System.out.println("Can Drive a Car.");
			}else {
				System.out.println("Can not Drive a Car.");
			}

	}else {
		System.out.println("Ineligible to Drive a Car.");
	}

}
	
}
