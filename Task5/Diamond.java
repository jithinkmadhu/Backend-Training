package com.orthofx.com;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		sc.close();
		
		int space = n-1;
		int star = 1;
		for ( int i = 0; i < n; i++) { 
			for ( int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			space--;
			for ( int k = 0; k < star; k++) {
				System.out.print("*");
			}
			star+=2;
			System.out.println();
		}
		space = 1;
		star = star-4;
		for ( int i = n-1; i > 0; i--) {
			for ( int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			space++;
			for ( int k = 0; k < star; k++) {
				System.out.print("*");
			}
			star-=2;
			System.out.println();
		}
	}

}
