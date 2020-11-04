// Comments

public class Professor {

	// Declare our variables
	public String name = "Mr. Messner";
	public int votes = 0;
	public String subject = "Comp Sci";
	
	// OPTIONAL
	// Constructor
	public Professor()
	{
		votes = 5;
		System.out.println("You have selected " + name);
	}
	
	public void info()
	{
		System.out.println("Professor Name: " + name);
		System.out.println("Votes: " + votes);
	}
	
	public void upVote()
	{
		votes++;
	}
	
	public void downVote()
	{
		votes--;
	}
	
	public void rollProf(int rn)
	{
		if(votes > rn)
			System.out.println("You professor stays on the Hill.");
		else
			System.out.println("Your professor was rolled down the Hill.");
		votes = 5;
	}
	
}
