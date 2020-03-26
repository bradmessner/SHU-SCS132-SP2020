// Header
import java.util.Scanner;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOne = 783;
		int numberTwo = 9833;
		int menuChoice;
		
		// Call our menu
		menuChoice = mainMenu();
		
		// Perform Addition
		if (menuChoice == 1)
		{
			addThemNumbers(numberOne,numberTwo);
		}
		
		if (menuChoice == 2)
		{
			subtractThemInstead(numberOne,numberTwo);
		}

		
	}
	
	// Declare the mainMenu Method
	public static int mainMenu()
	{

		Scanner keyboard = new Scanner(System.in);
		int mainMenuChoice;
		System.out.println("Main Menu");
		System.out.println("==== ====");
		System.out.println("1.) Addition");
		System.out.println("2.) Subtraction");
		System.out.print("Please select a choice: ");
		mainMenuChoice = keyboard.nextInt();
		return mainMenuChoice;
	}
	
	// Perform Addition of Two Numbers
	public static void addThemNumbers(int numOne, int numTwo)
	{
		int sum = numOne + numTwo;
		// int sum;
		// sum = numOne + numTwo;
		System.out.println("The total is: " + sum);
	}
	
	// Perform Subtraction
	public static void subtractThemInstead(int firstNumber, int secondNumber)
	{
		System.out.println("The difference is: " + (firstNumber-secondNumber));
	}
	

}
