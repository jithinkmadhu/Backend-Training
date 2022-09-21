package com.orthofx;

import java.util.Scanner;

public class PyramidWhile {
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		sc.close();
		i = 1;
		while (i <= n) {
			j = 1;
			while (j <= n - i) {
				System.out.print(" ");
				j++;
			}
			j = 1;
			while (j <= i) {
				System.out.print("* ");
				j++;
			}
			i++;
			System.out.println();
		}

	}
}
