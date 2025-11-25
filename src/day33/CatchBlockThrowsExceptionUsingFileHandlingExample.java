package day33;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CatchBlockThrowsExceptionUsingFileHandlingExample {
	public static void main(String[] args) 
	{
		try
		{
		processFile();
		}
		catch(DataAccessException ex1)
		{
			System.out.println("Message to Customer "+ ex1.getMessage());
		}
	}

	public static void processFile() throws DataAccessException
	{
		readFile();
	}
	
	public static void readFile() throws DataAccessException 
	{
		String fileName="myfolder/file11.txt";
		FileReader fr=null;
		try 
		{
			fr=new FileReader(fileName);
			BufferedReader br=new BufferedReader(fr);
			
			String line=br.readLine();
			System.out.println(line);
			System.out.println("number of chars is " +line.length());
			fr.close();
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());  //log for developer
			throw new DataAccessException("File could not be read");
		}
	}

	

}
