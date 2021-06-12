package com.corejava;

import java.util.Scanner;

public class VowelConsonant {
	static void checkVowelConsonant(char ch) {
		if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is vowel");
		}else {
			System.out.println(ch + " is consonant");
		}
			
	}

	public static void main(String[] args) {
		System.out.println("Enter character for check vowel or consonant :  ");
		Scanner ch = new Scanner(System.in);
		char charector = ch.next( ).charAt(0);
		ch.close();
		
		checkVowelConsonant(charector);
		
		
	}

}
