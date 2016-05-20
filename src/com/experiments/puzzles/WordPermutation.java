package com.experiments.puzzles;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordPermutation {
	public static void main(String[] args) {
		
	
	System.out.println("Enter the string whose permutation we need to show :");
	Scanner in = new Scanner(System.in);
	String givenWord = in.nextLine();
	//System.out.println(permute(givenWord));
	permute("", givenWord);
}

	private static void permute(String beginningString,String endingString) {
if (endingString.length()<=0)
	System.out.println(beginningString+endingString);
	
else
	for(int i =0;i<endingString.length();i++){
		String newString = endingString.substring(0, i) + endingString.substring(i+1);
		permute(beginningString+endingString.charAt(i), newString);
	}
		
		
		
	}

}
