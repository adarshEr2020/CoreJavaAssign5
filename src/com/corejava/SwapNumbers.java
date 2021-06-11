package com.corejava;
import java.util.Scanner;

public class SwapNumbers {
	static void swapNumber(int n1, int n2) {
		
		int num3 = n1;
		n1 = n2;
		n2 = num3;
		System.out.println("after swapping numbers num1 : " +n1 +" num2 : " +n2 );
		
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Swapping numbers -");
		System.out.println("Enter num1");
		int num1 = input.nextInt();
		System.out.println("Enter num1");
		int num2 = input.nextInt();
		input.close();
		
		System.out.println("before swapping numbers num1 : " +num1 +" num2 : " +num2 );
		swapNumber(num1,num2);
	}

}
