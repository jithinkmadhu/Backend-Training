package com.orthofx.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalAddition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size;
		int firstDiagonalSum = 0;
		int secondDiagonalSum = 0;
		int sum;
		ArrayList<List<Integer>> matrix = new ArrayList<List<Integer>>();
		
		System.out.print("Enter the size of the Matrix : ");
		size = sc.nextInt();
		
		System.out.println("Enter the elements of 1st Matrix : ");
		for (int i = 0; i < size; i++) {
			List<Integer> row = new ArrayList<Integer>(size);
			for (int j = 0; j < size; j++) {
				int item = sc.nextInt();
				row.add(item);
			}
			matrix.add(row);
		}
		
		for(int i = 0; i < size; i++) {
			firstDiagonalSum = firstDiagonalSum + matrix.get(i).get(i);
		} 
		
		for(int i = 0,j = size-1; i < size && j >= 0; i++,j--) {
			secondDiagonalSum = secondDiagonalSum + matrix.get(i).get(j);
		}
		
		if(size%2 == 0)
			sum = firstDiagonalSum + secondDiagonalSum;
		else
			sum = firstDiagonalSum + secondDiagonalSum - matrix.get(size/2).get(size/2);
		
		System.out.println("Sum " + sum); 
		sc.close();
	}

}
