package com.orthofx;

import java.util.Scanner;

public class PyramidWhile {
	public static void main(String[] args) {
		int i, j, k;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		sc.close();
		i = 0;
		while (i < n) {
			j = 0;
			while (j < n - i) {
				System.out.print(" ");
				j++;
			}
			k = 0;
			while (k <= i) {
				System.out.print("* ");
				k++;
			}
			i++;
			System.out.println();
		}

	}
}