package com.orthofx;

import java.util.*;

public class MatrixAddition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int row1, column1, row2, column2;

		System.out.print("Enter the no.of rows and columns of 1st Matrix : ");
		row1 = sc.nextInt();
		column1 = sc.nextInt();

		System.out.print("Enter the no.of rows and columns of 2nd Matrix : ");
		row2 = sc.nextInt();
		column2 = sc.nextInt();

		if (row1 == row2 && column1 == column2) {
			ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<ArrayList<Integer>>();
			ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<ArrayList<Integer>>();
			ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

			System.out.println("Enter the elements of 1st Matrix : ");
			for (int i = 0; i < row1; i++) {
				ArrayList<Integer> row = new ArrayList<Integer>(column1);
				for (int j = 0; j < column1; j++) {
					int item = sc.nextInt();
					row.add(item);
				}
				matrix1.add(row);
			}

			System.out.println("Enter the elements of 2nd Matrix : ");
			for (int i = 0; i < row2; i++) {
				ArrayList<Integer> row = new ArrayList<Integer>(column1);
				for (int j = 0; j < column2; j++) {
					int item = sc.nextInt();
					row.add(item);
				}
				matrix2.add(row);
			}

			for (int i = 0; i < row2; i++) {
				ArrayList<Integer> row = new ArrayList<Integer>(column1);
				for (int j = 0; j < column2; j++) {
					int item = matrix1.get(i).get(j) + matrix2.get(i).get(j);
					row.add(item);
				}
				result.add(row);
			}

			System.out.println("Resultant Matrix : ");
			for (int i = 0; i < row2; i++) {
				for (int j = 0; j < column2; j++) {
					System.out.printf("%4d", result.get(i).get(j));
				}
				System.out.println();
			}

		} else {
			System.out.print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"
					+ "\nNo.of rows and columns should be equal\n"
					+ "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}

		sc.close();

	}

}
