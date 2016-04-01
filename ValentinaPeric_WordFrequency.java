package wordFrequency;

/**
 * @author Valentina Peric
 * @project Word Frequency, Datto Interview Question
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordFrequency 
{
	private String filename;

	public WordFrequency(String filename) 
	{
		this.filename = filename;
		
		
	}

	public void countFrequency(String filename)
	{
	
		String MaxWord = null;
		String currentMaxWord = null;
		
		int MaxFreq = -1;
		int currentMaxFreq = -1;
	
		char MaxChar = 'a';
		char currentMaxChar = 'a';

		int charArray [] = null;
		

	try
		{
			Scanner scanner = new Scanner(new File (filename));

			while(scanner.hasNextLine())
			{
				String str = scanner.nextLine();
				str = str.toLowerCase(); //Makes the entire string lowercase
				String [] sentence  = str.split("[\\.,\\s!;?:\"]+"); //Ignores punctuation
				

				//Step 1: Calculate the character frequencies of each word in the sentence
				//A nested loop is used to traverse the sentence and the word itself
				for (int i = 0; i < sentence.length; i++)
				{
					charArray = new int [26]; //Array for the character frequencies
					for (int j = 0; j < sentence[i].length(); j++)
					{
						
						currentMaxWord = sentence[i];
						currentMaxChar = sentence[i].charAt(j);
						charArray[ currentMaxChar - 'a' ]++;
						
						
						
					}

					//Step 2: Get the MAX value from the array of character frequencies
				

					for (int k = 0; k < charArray.length; k++)
					{
						if (charArray[k] > currentMaxFreq)
						{
							currentMaxFreq = charArray[k];
							currentMaxChar = (char)(k + 'a');
						}
					}
					//Step 3: Calculate which word had the highest number of frequencies for a character
					if (currentMaxFreq > MaxFreq)
					{
						MaxFreq = currentMaxFreq;
						MaxWord = currentMaxWord;
						MaxChar = currentMaxChar;
					}	
				}
				
				System.out.println(MaxChar + " occurs in" +  "  " + MaxWord + "  " + MaxFreq + " times. " );
		
			}
	}
	catch(FileNotFoundException e)
		 
		{
			System.out.println("File Not Found");
		}
		finally
		{		
			System.out.println("Hire Valentina Peric to be your intern! She will put her 110% into this internship, guranteed.");
		}
	}
}
