package com.orthofx;

import java.util.Scanner;

public class MultiplyConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int row, column, constant;

		System.out.print("Enter the no.of rows and columns of the Matrix : ");
		row = sc.nextInt();
		column = sc.nextInt();

		int matrix[][] = new int[row][column];
		
		System.out.println("Enter the elements of 1st Matrix : ");
		for ( int i = 0; i < row; i++) {
			for ( int j = 0; j < column; j++ ) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the constant you want to multiply : ");
		constant = sc.nextInt();

		int matrixResult[][] = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrixResult[i][j] = constant * matrix[i][j];
			}
		}

		System.out.println("Resultant Matrix : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf("% 4d ", matrixResult[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}

}
