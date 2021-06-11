package com.corejava;
import java.util.Scanner;
public class QuotientRemainder {

	public static void main(String[] args) {
		
		System.out.println("Enter dividend and divisor : ");
		Scanner input = new Scanner(System.in);
		int dividend = input.nextInt();
		int divisor = input.nextInt();
		input.close();
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		
		System.out.println("quotient : " +quotient +"/n" +"remainder " +remainder);
	}
}
