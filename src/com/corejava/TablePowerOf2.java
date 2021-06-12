//package com.corejava;
//import java.util.Scanner;
//
//public class TablePowerOf2 {
//
//	public static void main(String[] args) {
//
//		// read in one command-line argument
//		Scanner input = new  Scanner(System.in);
//		System.out.println("Enter the number : ");
//
//		int n =	input.nextInt();
//		input.close();
//
//		int i = 0; // count from 0 to N
//
//		int powerOfTwo = 1; // the it power of two
//
//		// repeat until i equals n
//
//		while (i <= n) {
//
//			System.out.println(i + "=" + powerOfTwo); // print out the power of two
//
//			powerOfTwo = 2 * powerOfTwo; // double to get the next one
//
//			i = i + 1;
//
//		}
//
//	}
//
//}

package com.corejava;
import java.util.Scanner;

public class TablePowerOf2 {

	void powerOf2(int n) {


		int i = 0; // count from 0 to N

		int powerOfTwo = 1; // the it power of two

		// repeat until i equals n

		while (i <= n) {

			System.out.println("2 power " +i + " = " + powerOfTwo); // print out the power of two

			powerOfTwo = 2 * powerOfTwo; // double to get the next one

			i = i + 1;
		}
	}

	public static void main(String[] args) {

		TablePowerOf2 power = new TablePowerOf2();
		// read in one command-line argument
		Scanner input = new  Scanner(System.in);
		System.out.println("Enter the number : ");	
		power.powerOf2(input.nextInt());
		input.close();

	}

}


