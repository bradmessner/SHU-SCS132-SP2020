// Headers

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
		
	}

}
