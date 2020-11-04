// Remarks

import java.util.Scanner;
import java.util.Random;

public class rollprofessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setup Variables
		int randomRoll = 0;
		int menuChoice = 0;
		
		Scanner keyboard = new Scanner(System.in);
		Random randomNumbers = new Random();
		
		// Create our Professor Class
		Professor profOne = new Professor();
		ComputerScienceProf profTwo = new ComputerScienceProf();
		
		 profTwo.numberOfTabsOpen = 5;
		 profTwo.calc();
		
		// Main Application Logic
		do
		{
			System.out.println("Roll Your Professor");
			System.out.println("=-=-=-=-=-=-=-=-=-=");
			System.out.println("1.) Display Prof Info");
			System.out.println("2.) Up Vote Professor");
			System.out.println("3.) Down Vote Professor");
			System.out.println("4.) Roll Your Prof");
			System.out.println("5.) Exit");
			System.out.println("What would you like to do? ");
			menuChoice = keyboard.nextInt();
			
			switch(menuChoice)
			{
				case 1:
					// Display Professor Info
					profOne.info();
					break;
				case 2:
					// Up Vote
					profOne.upVote();
					break;
				case 3:
					// Down Vote
					profOne.downVote();
					break;
				case 4:
					// Roll 'em
					randomRoll = randomNumbers.nextInt(11);
					profOne.rollProf(randomRoll);
					break;
				case 5:
					// Exit
					System.out.println("Thank you for playing. Your professor is going to take a nap.");
					break;
				default:
					System.out.println("Did not recognize menu choice.");
			}
			
			
		} while(menuChoice !=5);
		
		
		
		
		
		
		
	}

}
