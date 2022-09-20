package com.orthofx;

import java.util.Scanner;

public class Mark {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int mark;

		System.out.print("Enter the mark : ");
		mark = sc.nextInt();
		sc.close();

		if (mark >= 90)
			System.out.print("Amazing");
		else if (mark >= 80)
			System.out.print("Good");
		else if (mark >= 70)
			System.out.print("All right");
		else
			System.out.print("Okay");
	}
}