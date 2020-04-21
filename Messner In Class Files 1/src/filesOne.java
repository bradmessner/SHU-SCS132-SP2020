// Title:	File Usage
// Author:	Brad Messner
// Date:	April 14, 2020

import java.io.*;
import java.util.Scanner;

public class filesOne {

	// Throw an exception if something bad happens
	public static void main(String[] args) throws IOException{

		try
		{
			// Create a file to read from
			File filename = new File("/Users/bmessner/Desktop/salesData.txt");
			Scanner inputFile = new Scanner(filename);

			// Open a file to write to
			FileWriter fw = new FileWriter("/Users/bradmessner/Desktop/totalSales.txt", false);
			PrintWriter outputFile = new PrintWriter(fw);


			// Create Total Variables
			double totalA = 0.00;
			double totalB = 0.00;
			double totalC = 0.00;
			double totalSales = 0.00;

			// Loop through data file and add totals
			while (inputFile.hasNext())
			{
				// Read data first
				char category = inputFile.next().charAt(0);
				double categoryAmount =inputFile.nextDouble();

				// OPTION 1 for Total Sales
				totalSales += categoryAmount;

				// Add each line to the total per category
				switch(category)
				{
				case 'A':
					totalA += categoryAmount;
					break;
				case 'B':
					totalB += categoryAmount;
					break;
				case 'C':
					totalC += categoryAmount;
					break;
				}
			}


			// OPTION 2 for Total Sales
			// totalSales = totalA + totalB + totalC;

			// Output results to file
			outputFile.println("Total Sales by Category");
			outputFile.println("=======================");
			outputFile.println("Category A:\t" + totalA);
			outputFile.println("Category B:\t" + totalB);
			outputFile.println("Category C:\t" + totalC);
			outputFile.println("\nTotal Sales:\t" + totalSales);

			// Notify user processing is done
			System.out.println("Processing is finished.");

			// Close files
			inputFile.close();
			outputFile.close();
		}
		catch (EOFException error)		// Potential Error #1
		{
			System.out.println("Sorry.  I seem to have reached the end of the file.");
		}
		catch (FileNotFoundException error) // Potential Error #2
		{
			System.out.println("Sorry.  I cannot seem to find that file.");
			System.out.println("Error Message: " + error.getMessage());
		}
		finally
		{
			System.out.println("Finished.");
		}
	}
}







