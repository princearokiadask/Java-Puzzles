package com.experiments.puzzles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PascalTriange {
	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter the number of rows : ");
		int row = Integer.parseInt(br.readLine());
		
		//Iterating for fill data to each row.
		for(int currentRow=0;currentRow<row;currentRow++)
		{	//Iteration for Space to find no of spaces in each row
			for(int noOfSpaces=row;noOfSpaces>currentRow;noOfSpaces--)
			{
				System.out.print(" ");
			}
			
            int number = 1;
            //Iteration to find value in each row
			for(int i=0;i<=currentRow;i++)
			{

				 System.out.print(number+" ");
                 number = number * (currentRow - i) / (i + 1);
				 
			}
			System.out.println();
		}

	}
}
