// Title:	File Usage
// Author:	Brad Messner
// Date:	April 14, 2020

import java.io.*;


public class filesOne {

											// Throw an exception if something bad happens
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		// Create an output file for writing data
		
		// Winners File
		FileWriter fw = new FileWriter("/Users/bradmessner/Desktop/Winners.txt", true);
												// true means I can append/add to the file
		PrintWriter winnersOutputFile = new PrintWriter(fw);
		
		// Losers File
		FileWriter fw2 = new FileWriter("/Users/bradmessner/Desktop/Losers.txt", true);
		// true means I can append/add to the file
		PrintWriter losersOutputFile = new PrintWriter(fw2);

			winnersOutputFile.println("Student Info");
			winnersOutputFile.println("John");
			winnersOutputFile.println("Michelle");
			winnersOutputFile.println("Jenny");


		winnersOutputFile.close();			// SUPER SUPER SUPER SUPER Important
		losersOutputFile.close();			// No data was written, but close anyway
		
		
		

		
		
	}

}
