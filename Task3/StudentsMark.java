package com.orthofx;

import java.util.*;

public class StudentsMark {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name,searchName;
		int mark,n;
		
		HashMap<String, Integer> studentsMarkList = new HashMap<>();
		
		System.out.print("Enter the no.of students :");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the name of the student and mark : ");
			name = sc.next();
			mark = sc.nextInt();
			studentsMarkList.put(name,mark);
		}
		
		System.out.print("Enter the name of the student : ");
		searchName = sc.next();
		
		if (studentsMarkList.containsKey(searchName)) {
			mark = studentsMarkList.get(searchName);
			System.out.printf("Mark %s got : %d", searchName, mark);
		}
		sc.close();
	}

}
