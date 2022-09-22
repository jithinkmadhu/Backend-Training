package com.orthofx;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int row1,column1,row2,column2;
		
		System.out.print("Enter the no.of rows and columns of 1st Matrix : ");
		row1 = sc.nextInt();
		column1 = sc.nextInt();
		
		System.out.print("Enter the no.of rows and columns of 2nd Matrix : ");
		row2 = sc.nextInt();
		column2 = sc.nextInt();
		
		if(row1 == row2 && column1 == column2) {
			int matrix1[][] = new int[row1][column1];
			
			System.out.println("Enter the elements of 1st Matrix : ");
			for ( int i = 0; i < row1; i++) {
				for ( int j = 0; j < column1; j++ ) {
					matrix1[i][j] = sc.nextInt();
				}
			}
			
			int matrix2[][] = new int[row2][column2];
			
			System.out.println("Enter the elements of 2nd Matrix : ");
			for ( int i = 0; i < row2; i++) {
				for ( int j = 0; j < column2; j++ ) {
					matrix2[i][j] = sc.nextInt();
				}
			}
			
			int matrixResult[][] = new int[row1][column1];
			
			for ( int i = 0; i < row1; i++) {
				for ( int j = 0; j < column1; j++ ) {
					matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}
			
			System.out.println("Resultant Matrix : ");
			for ( int i = 0; i < row1; i++) {
				for ( int j = 0; j < column1; j++ ) {
					System.out.printf("% 4d ",matrixResult[i][j]);
				}
				System.out.println();
			}
		} else {
			System.out.print("No.of rows and columns should be equal");
		}
		
		sc.close();
	}

}
