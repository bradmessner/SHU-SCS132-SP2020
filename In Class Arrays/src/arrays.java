// Headers
import java.util.Random;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Create an array for the home football team
		// Index will be 0 - 4
		int[] score = new int[5];
				// int[] score;
				// score = new int[5];
		
		score[0] = 7;		// Score for the first quarter
		score[1] = 13;		// second quarter
		score[2] = 0;		// third quarter
		score[3] = 7;		// fourth quarter
							// we did NOT go into overtime
							// i do not NEED to do anything with score[4]
		
		// Calculated the total
		int totalScore = 0;
		totalScore = score[0] + score[1] + score[2] + score[3] + score[4];
		
		// Output the scores
		System.out.println("The score from quarter 1 was: " + score[0]);
		System.out.println("The score from quarter 2 was: " + score[1]);
		System.out.println("The score from quarter 3 was: " + score[2]);
		System.out.println("The score from quarter 4 was: " + score[3]);
		System.out.println("The score from overtime was: " + score[4]);
		System.out.println("The total score was: " + totalScore);
		
		
		// Now that's work with arrays AND loops (preload data using randomization)
		Random  randomNumber = new Random();
		Scanner keyboard     = new Scanner(System.in);
		
		// Ask user how many numbers to generate
		int arraySize = 0;
		System.out.print("How many numbers do you want? ");
		arraySize = keyboard.nextInt();
		
		
		if(arraySize >= 0)
		{
		int[] myNumbers = new int[arraySize];		// index from 0 - 44
		int summedNumbers = 0;
		
		// Use a for loop to loop through all elements of the array
		for(int nums = 0; nums<arraySize; nums++)
		{
				myNumbers[nums] = randomNumber.nextInt(1000);	// randomize between 1-999
															// I need to add +1 if I 
															// want 1-1000
				System.out.println("Your number is:" + myNumbers[nums]);
				summedNumbers = summedNumbers + myNumbers[nums];
				// DO NOT want this:
				// summedNumbers = summedNumbers + randomNumber.nextInt(1000);
		}
		System.out.println("Total of numbers added: " + summedNumbers);
		
		
		for(int nums = 0; nums<arraySize; nums++)
		{
			System.out.print(myNumbers[nums] + " ");
		}
		
		}
		
		
		// Create a 2D array
		int[][] favoriteNumbers = new int[2][3];	// 2 rows, 3 columns
													
		favoriteNumbers[0][0] = 5;
		favoriteNumbers[0][1] = 9;
		favoriteNumbers[0][2] = 2;
		favoriteNumbers[1][0] = 8;
		favoriteNumbers[1][1] = 12;
		favoriteNumbers[1][2] = 11;

		
	}

}
