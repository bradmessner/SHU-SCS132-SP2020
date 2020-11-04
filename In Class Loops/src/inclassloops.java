// Name:	In Class Loops
// Author:	Brad D. Messner
// Version:	1.0
// Date:	Feb 18, 2020

public class inclassloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfPickles = 24;
		
		// Loop through and reduce pickles by one every time you eat them
		while(numberOfPickles > 0)
		{
			System.out.println("That pickle was great. ");
			
			// reduce pickles by one.
			numberOfPickles = numberOfPickles - 1;
			// numberOfPickles--;
			// --numberOfPickles;
			
			// Let user know how many pickles are left
			System.out.println("You have " + numberOfPickles + " pickles left.");

		}
		

		
		int concertTickets = 5;
		
		// Reduce the number of tickets by 2 every time you attend a concert.
		do
		{
			// Reduce tickets by 2
			concertTickets--;
			
			if(concertTickets==1)
			{
				System.out.println("Too bad. I am going alone.");
			}
			else
			{
				concertTickets--;
			}
			
			// Output remaining tickets
			System.out.println("That is a great concert.");
			System.out.println("Too bad I only have " + concertTickets + " tickets left.");
			
		} while(concertTickets >0);
		
		
		// We do NOT need to initialize age in advance)
		// int age = 0;
		
		// Loop and count UP until the user can drive
		
		for(int age = 0; age <= 18; age++)
		{
			System.out.println("You are " + age + " years old.");
			if (age < 16)
				System.out.println("You are NOT old enough to drive.");
			else
			{
				if (age == 16)
				{
					System.out.println("Good luck on your drivers test.");
					break;
				}
				if (age == 17)
					System.out.println("Enjoy Pineapple Express. You can watch an R movie.");
				
				if (age == 18) 
				{
					System.out.println("You can now vote.");
					System.out.println("You are now an adult.");
				}
			}
			// We do NOT want age++ because age is iterated in our for
			// age++;
		}
		
		
		
		

	}

}
