package com.flm2.conditional;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		System.out.print("Enter Floor Number :");
		
		Scanner sc = new Scanner(System.in);
			
		int floor = sc.nextInt();
		
		
		switch(floor){
			case 1 : 
				System.out.println("You're on First Floor");
				break;
			case 2 :
				System.out.println("You're on Second Floor");
				break;
			case 3 :
				System.out.println("You're on Third Floor");
				break;
			case 4 : 
				System.out.println("You're on Fourth Floor");
				break;
			default :
					System.out.println("You're on Invalid Floor");
		}
		
		

	}

}
