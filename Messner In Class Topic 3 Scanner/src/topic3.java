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
		
		// Close the keyboard
		keyboard.close();
		

		
		// Output results
		System.out.println(firstName + " " + lastName + " is " + age + " years old.");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age:  " + age);
		

	}

}
