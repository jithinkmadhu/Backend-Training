package com.orthofx.com;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		sc.close();
		
		for ( int i = 0; i < n; i++) {
			for ( int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for ( int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for ( int k = 0; k <= i-1; k++) {
				System.out.print("*");
			}
				
			System.out.println();
		}
		int space = 1;
		for ( int i = n-1; i > 0; i--) {
			for ( int j = 0; j <= space; j++) {
				System.out.print(" ");
			}
			space++;
			for ( int k = i-1; k > 0; k--) {
				System.out.print("*");
			}
			for ( int k = 0; k <= i-1; k++) {
				System.out.print("*");
			}
				
			System.out.println();
		}

	}

}
