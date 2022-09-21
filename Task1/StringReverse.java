package com.orthofx;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len;

		System.out.print("Enter String : ");
		String str = sc.nextLine();
		sc.close();
		len = str.length();

		System.out.print("Reversed String : ");
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
