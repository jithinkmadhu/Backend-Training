package com.orthofx;

import java.util.*;

public class Pattern {
	
	public static int findIndex(char arr[], char t)
    {
        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int indexOfOpeningSquareBracket,multiplier;
		char array[] = new char[1];
		String inputRegEx, multi = "";
		String pattern = "";
		
		System.out.print("Enter the pattern : ");
		inputRegEx = sc.next();
		System.out.println(array.length);
		array = inputRegEx.toCharArray();
		System.out.println(array.length);
		indexOfOpeningSquareBracket = findIndex(array,'[');
		
		for(int i = 0; i < indexOfOpeningSquareBracket; i++) {
			multi += array[i];
		}
		
		multiplier = Integer.parseInt(multi);
		
		for(int i=indexOfOpeningSquareBracket+1;i<array.length-1;i++) {
			pattern += array[i];
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		
		for(int i=0;i<multiplier;i++) {
			System.out.print(pattern);
		}  

        sc.close();
		
	}

}
