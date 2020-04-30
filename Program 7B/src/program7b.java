
import java.util.Scanner;
import java.io.*;


public class program7b {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		// Create a file to read from
		File filename = new File("/Users/bradmessner/Desktop/gradesin.txt");
		Scanner inputFile = new Scanner(filename);
		
		// Open a file to write to
		FileWriter fw = new FileWriter("/Users/bradmessner/Desktop/gradestotal.txt", true);
		PrintWriter outputFile = new PrintWriter(fw);
		
		// Create Variables
		double totalGrades = 0.00;
		int totalNumber = 0;
		
		// Loop through the file
		while (inputFile.hasNext())
		{
			// Read data
			double tempGrade = inputFile.nextDouble();
			totalGrades += tempGrade;
			totalNumber++;
		}
		
		// Output data to our file
		outputFile.println("Total Grade Information");
		outputFile.println("Total Points: " + totalGrades);
		outputFile.println("Total Grades: " + totalNumber);
		outputFile.println("Average Grade: " + (totalGrades/totalNumber));
		
		// Close files
		inputFile.close();
		outputFile.close();
		
		
	}

}
