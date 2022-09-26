package com.orthofx;

import java.util.*;

public class MatrixMultiplicationConstant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int row, column, constant;

		System.out.print("Enter the no.of rows and columns of the Matrix : ");
		row = sc.nextInt();
		column = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		System.out.println("Enter the elements of the Matrix : ");
		for (int i = 0; i < row; i++) {
			ArrayList<Integer> rowList = new ArrayList<Integer>(column);
			for (int j = 0; j < column; j++) {
				int item = sc.nextInt();
				rowList.add(item);
			}
			matrix.add(rowList);
		}
		
		System.out.println("Enter the constant you want to multiply : ");
		constant = sc.nextInt();
		
		for (int i = 0; i < row; i++) {
			ArrayList<Integer> rowList = new ArrayList<Integer>(column);
			for (int j = 0; j < column; j++) {
				int item = matrix.get(i).get(j) * constant;
				rowList.add(item);
			}
			result.add(rowList);
		}
		
		System.out.println("Resultant Matrix : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf("%4d", result.get(i).get(j));
			}
			System.out.println();
		}
		
		sc.close();

	}

}
