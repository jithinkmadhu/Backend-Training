package com.orthofx;

import java.util.*;

public class Pattern {

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
		String howManyString = "";
		String rev="";
		char arr[] = new char[100];
		
		indexOfFirstOSB = findIndexOfOSB(array);
		indexOfCSB = findIndexOfCSB(array, indexOfFirstOSB);

		for(int k = 1;k >= 0;k++) {
			if(indexOfFirstOSB-k < 0 ) {
				break;
			}
			if(array[indexOfFirstOSB-k] >= '0' && array[indexOfFirstOSB-k] <= '9') {
				howManyString = howManyString + array[indexOfFirstOSB-k];
			} else {
				break;
			}
		}
		
		for(int i = howManyString.length()-1;i>=0;i--) {
			rev += howManyString.charAt(i);
		}
		
		howMany = Integer.parseInt(rev);
		
		for(int i = indexOfFirstOSB + 1; i < indexOfCSB; i++) {
			pattern += array[i];
		}
		
		for(int i = 0; i < howMany; i++) {
			fullPattern = fullPattern + pattern;
		}
		
		for(int i = 0; i < indexOfFirstOSB-(howManyString.length());i++) {
			nextArray = nextArray + array[i];
		}

		nextArray = nextArray + fullPattern;
		
		for(int i = indexOfCSB+1; i < array.length;i++) {
			nextArray = nextArray + array[i];
		}
		
		arr = nextArray.toCharArray();
		
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
