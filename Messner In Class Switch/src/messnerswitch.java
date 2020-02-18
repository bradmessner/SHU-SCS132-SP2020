//	Project:	Topic 4 - Switch Statements
//  Author:		Brad D. Messner
//  Date:		Feb 13, 2020
//  Version:	1.0
//	Git User:	bradmessner

import java.util.Scanner;


public class messnerswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Activate scanner/keyboard
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Main Menu - Overwatch");
		System.out.println("\t1.) Start Game");
		System.out.println("\t2.) Highlights");
		System.out.println("\t3.) High Scores");
		System.out.println("\t4.) Exit");
		System.out.print("What item would you like? ");
		
		// Placeholder to ask for user input later
		int menuChoice = keyboard.nextInt();
		int highScore = 5000;
		
		switch (menuChoice) {
			case 1:
				System.out.println("Loading Game....");
				break;
			case 2:
				System.out.println("Let's watch those highlights");
				break;
			case 3: 
				System.out.println("Highest Score: Brad");
				System.out.println("Lowest Score: Dr. Hoover");
				System.out.println("Brad > Dr. Hoover");
				
				if (highScore > 4000)
					System.out.println("So Close");
				else
					System.out.println("Get more practice");
				
				break;
			case 12:
				break;
			default:
				System.out.println("Thanks for playing");	
		}
		
		
		
		

	}

}
