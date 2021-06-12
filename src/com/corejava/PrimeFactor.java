package com.corejava;
import java.util.Scanner;

public class PrimeFactor {

	static void findPrimeFactor() {

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		
		for(int i = 2; i< number; i++) {
			while(number % 2 == 0) {
				System.out.println("factor : "+i +" ");
				number = number/i;
			}
		}
		if(number > 2) {
			System.out.println("number " +number);
		}
	}
	
	public static void main(String[] args) {

		System.out.println("Enter number to find the prime factors : ");
		findPrimeFactor();

	}

}
