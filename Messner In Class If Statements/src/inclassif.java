//  Name:		In Class If Statements
//  Author:		Brad D. Messner
//  Date:		Feb 11, 2020
//  Version:	1.0
//	Git User:	bradmessner

public class inclassif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Variables
		int age = 25;
		int grade = 82;
		
		
		if (age >= 21) 
		{
			System.out.println("You can drink whatever you want.");
		} else 
		{
			System.out.println("You can have a nice glass of milk.");
			System.out.println("Your mother said to go home.");
		} 
		
		
		if (grade >80)
			System.out.println("Good job.");
		else
		{
			System.out.println("See me after class.");
			System.out.println("You can do better.");
		}
		
		
		// Second Option
		if (grade >80)
			System.out.println("Good job.");
		if (grade < 80)
			System.out.println("Study a bit more.");
		if (grade < 60)
			System.out.println("See me after class.");
		
		
		switch (grade) {
			case 90:
				System.out.println("Great job.");
				break;
			default:
				//	
		}
		
	}

}
