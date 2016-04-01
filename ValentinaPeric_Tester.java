package wordFrequency;

import java.util.*;


import java.io.*;


public class Tester 
{
	public static void main ( String[] args )
			throws IOException
	{
		
		String currentDir = new File(" ").getAbsolutePath();
		currentDir = currentDir.substring(0, currentDir.length()-1);
		System.out.println(currentDir);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your sentence textfile: ");
		String sentence1 = currentDir + scanner.nextLine();
		
		WordFrequency sentence = new WordFrequency(sentence1);
		sentence.countFrequency(sentence1);
		
	
		
		scanner.close();
	}
}