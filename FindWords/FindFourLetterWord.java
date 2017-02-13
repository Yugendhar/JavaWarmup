package FindWords;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindFourLetterWord
{
	
private static Scanner sc;

public static void main(String[] args) throws FileNotFoundException
{

	sc = new Scanner(new File("test.txt"));
	sc.useDelimiter("\n");
	int count=0;
	System.out.println("Counting number of words with length 4 in each line from File  Test.txt \n");
	
	while(sc.hasNext())
	{
		String line=sc.next();
		String[] words= line.trim().split("\\s+");	
		//Matches length of word to 4
		//If true, increment the count
		for(String w : words)
		{
		if(w.length()==4)
		{
			count++;
		}
	
		}
		System.out.println(count);
		count=0;
	}	
}
}