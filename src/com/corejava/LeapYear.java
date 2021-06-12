package com.corejava;

import java.util.Scanner;

public class LeapYear {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
            int year;
            System.out.println("Enter an Year : ");
            Scanner sc = new Scanner(System.in);
            year = sc.nextInt();

            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
                System.out.println(" leap year" +year);
            else
                System.out.println(" not a leap year" +year);
    }
}
