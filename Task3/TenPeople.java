package com.orthofx;

import java.util.*;

public class TenPeople {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 10;
		String name;

		ArrayList<String> people = new ArrayList<String>(n);

		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the %d nd name : ", i + 1);
			name = sc.nextLine();
			people.add(name);
		}
		
		Collections.sort(people);
		
		System.out.println(people);
		
		sc.close();
	}

}
