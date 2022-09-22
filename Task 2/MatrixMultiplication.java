package com.orthofx;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int row1, column1, row2, column2;
		int i, j, k;

		System.out.print("Enter the no.of rows and columns of 1st Matrix : ");
		row1 = sc.nextInt();
		column1 = sc.nextInt();

		System.out.print("Enter the no.of rows and columns of 2nd Matrix : ");
		row2 = sc.nextInt();
		column2 = sc.nextInt();

		if (column1 == row2) {
			int matrix1[][] = new int[row1][column1];

			System.out.println("Enter the elements of 1st Matrix : ");
			for (i = 0; i < row1; i++) {
				for (j = 0; j < column1; j++) {
					matrix1[i][j] = sc.nextInt();
				}
			}

			int matrix2[][] = new int[row2][column2];

			System.out.println("Enter the elements of 2nd Matrix : ");
			for (i = 0; i < row2; i++) {
				for (j = 0; j < column2; j++) {
					matrix2[i][j] = sc.nextInt();
				}
			}

			int matrixResult[][] = new int[row1][column1];

			for (i = 0; i < row1; i++) {
				for (j = 0; j < column1; j++) {
					for (k = 0; k < row2; k++) {
						matrixResult[i][j] = matrixResult[i][j] + matrix1[i][k] * matrix2[k][j];
					}
				}
			}

			System.out.println("Resultant Matrix : ");
			for (i = 0; i < row1; i++) {
				for (j = 0; j < column1; j++) {
					System.out.printf("% 4d ", matrixResult[i][j]);
				}
				System.out.println();
			}
		} else {
			System.out.print("No.of columns of first matrix should be equal to no.of rows of second matrix");
		}

		sc.close();

	}

}
