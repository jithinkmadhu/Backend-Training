package com.orthofx;

import java.util.*;

public class PatternThree {

	static int findIndexOfOSB(char arr[]) {
		for(int i=arr.length-1;i>-1;i--){    
            if(arr[i] == '['){    
                return i;    
            }    
        }    
        return -1; 
	}

	static int findIndexOfCSB(char arr[], int indexOfOSB) {
		int i;

		Stack<Integer> st = new Stack<>();

		for (i = indexOfOSB; i < arr.length; i++) {

			if (arr[i] == '[') {
				st.push((int) arr[i]);
			} else if (arr[i] == ']') {
				st.pop();
				if (st.empty()) {
					return i;
				}
			}
		}

		return -1;

	}

	static int makePattern(char array[]) {
		int indexOfFirstOSB, indexOfCSB, howMany;
		String pattern = "";
		String fullPattern = "";
		String nextArray = "";
		char arr[] = new char[100];
		
		indexOfFirstOSB = findIndexOfOSB(array);
		indexOfCSB = findIndexOfCSB(array, indexOfFirstOSB);

		howMany = Character.getNumericValue(array[indexOfFirstOSB-1]);
		
		for(int i = indexOfFirstOSB + 1; i < indexOfCSB; i++) {
			pattern += array[i];
		}
		
//		System.out.println("howMany = " + howMany);
//		System.out.println("pattern = " + pattern);
//		System.out.println(array);
		for(int i = 0; i < howMany; i++) {
			fullPattern = fullPattern + pattern;
		}
//		System.out.println("fullPattern = " + fullPattern);
		
		for(int i = 0; i < indexOfFirstOSB-1;i++) {
			nextArray = nextArray + array[i];
		}
//		System.out.println("nextArray = " + nextArray);
		nextArray = nextArray + fullPattern;
		
//		System.out.println("nextArray = " + nextArray);
		for(int i = indexOfCSB+1; i < array.length;i++) {
			nextArray = nextArray + array[i];
		}
		
		arr = nextArray.toCharArray();
		
//		System.out.println("nextArray = " + nextArray);
		
//		System.out.println(arr);
		
		if(findIndexOfOSB(arr) != -1)
			makePattern(arr);
		else {
			System.out.print("Pattern : ");
			System.out.println(arr);
		}
			
		return 0;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inputRegEx;
		char regExArray[] = new char[1];

		System.out.print("Enter the Regular Expression : ");
		inputRegEx = sc.next();

		regExArray = inputRegEx.toCharArray();

		makePattern(regExArray);

		sc.close();

	}

}
