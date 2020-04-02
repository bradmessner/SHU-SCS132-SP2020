// Title:	Program 6 - Arrays
// Author:	Brad Messner
// Date:	Apr 2, 2002
// Version:	1.0

// Import additional code being used
import java.util.Scanner;
import java.util.Random;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Declare variables
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();
		int teamOneTotal = 0;
		int teamTwoTotal = 0;
		String teamOne = "Seton Hill:\t";
		String teamTwo = "Mercyhurst:\t";

		// Prompt user for # of sections and create array
		System.out.print("How many sections to you want to play? ");
		int sections = keyboard.nextInt();

		// Create the array
		int[][] scores = new int[2][sections];		// 2 col, X rows

		// LOOP ONE: Loop through rows first
		for (int row = 0; row<scores[0].length; row++)
		{
			// LOOP TWO: Loop through cols second
			for (int col = 0; col<scores.length; col++)
			{
				// Random info for Team One
				if(col == 0)
				{
					//Random
					scores[col][row] = randomNumber.nextInt(100);
					//Total
					teamOneTotal += scores[col][row];
					//Add to our string
					teamOne = teamOne + scores[col][row] + "\t";
				}

				// Random info for Team Two
				if(col == 1)
				{
					//Random
					scores[col][row] = randomNumber.nextInt(100);
					//Total
					teamTwoTotal += scores[col][row];
					//Add to our string
					teamTwo = teamTwo + scores[col][row] + "\t";
				}


			} // end of LOOP TWO
		} // end of LOOP ONE
		
		// Output total scores
		System.out.println(teamOne + "=\t" + teamOneTotal);
		System.out.println(teamTwo + "=\t" + teamTwoTotal);

		if (teamOneTotal == teamTwoTotal)
		{
			System.out.println("There was a tie!");
		}
		else
		{
			if (teamOneTotal > teamTwoTotal)
				System.out.println("Team One is the Winner!");
			else
				System.out.println("Team Two is the Winner!");
		}
	}

}









