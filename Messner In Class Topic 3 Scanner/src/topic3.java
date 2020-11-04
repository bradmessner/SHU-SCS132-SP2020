//	Project:	Topic 3 - Scanner and Strings
//  Author:		Brad D. Messner
//  Date:		Feb 6, 2020
//  Version:	1.0
//	Git User:	bradmessner

import java.util.Scanner;


public class topic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Start Scanner
		Scanner keyboard = new Scanner (System.in);
		
		// Declare Variables
		String firstName = "Brad";
		String lastName;
		int age;
		
		// Collect User Input
		System.out.print("What is your last name? ");
		lastName = keyboard.next();
		System.out.print("What is your age? ");
		age = keyboard.nextInt();
		
		
		while(age>50)
		{
			System.out.println("You're old.");
			age--;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Menu
		System.out.println("Main Menu");
		System.out.println("=========");
		System.out.println("1.) Pineapple Express");
		System.out.println("2.) Wreck It Ralph");
		System.out.println("3.) Mulan");
		System.out.println("4.) Madagascar 3");
		System.out.print("What movie do you want to watch?");
		int movieSelection = keyboard.nextInt();
		
		if(movieSelection==1)
			System.out.println("Enjoy Pineapple Express.");
		if(movieSelection==2)
			System.out.println("Enjoy W I R.");
		
		switch(movieSelection)
		{
			case 1:
				System.out.println("Enjoy Pineapple Express.");
				break;
			case 4:
				System.out.println("Enjoy Madagascar 3.");
				break;
			default:
				System.out.println("Sorry - I didn't recognize that selection.");	
		}
		
		
		
		// Close the keyboard
		keyboard.close();
		

		
		// Output results
		System.out.println(firstName + " " + lastName + " is " + age + " years old.");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age:  " + age);
		

	}

}
