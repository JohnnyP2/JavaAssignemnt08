// Johnny Pedicone
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class Assignemt8_FileIO 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		String name;
		String text = "";
		String appendText;
		System.out.println("Enter the file name:");// The files name is test.txt
		name = key.nextLine();
		File test = new File(name);
		try 
		{
			FileWriter output = new FileWriter("testMODIFIED.txt");
			Scanner fileScan = new Scanner(test);
			while(fileScan.hasNextLine()) 
			{
				text += fileScan.nextLine();
				System.out.println(text);	//outputs test.txt
			}
			System.out.println("Enter the text you would like to append:"); // enter the test that you want to add
			appendText = key.nextLine();
			output.write(text); // adds the text from test.txt to testMODIFIED.txt
			output.write(appendText);	// adds the new text to test.txt
			output.close();	
			System.out.println("Successfully wrote a new file!: testMODIFIED.txt");
		}
		catch(IOException noneFound)//If the user enters the wrong filename it catches
		{
			System.out.println("Error! File " + name +" not found");
			
			
			
		}
	}
	
	
	
	
}
