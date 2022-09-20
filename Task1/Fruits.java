package com.orthofx;

import java.util.Scanner;

public class Fruits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the name of the fruit : ");
		String fruit = sc.nextLine();
		sc.close();

		switch (fruit) {
		case "apple":
			System.out.println("red");
			break;
		case "banana":
			System.out.println("yellow");
			break;
		default:
			System.out.println("green");
		}
	}
}
