import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindWordsBeginningLetter
{
	
private static Scanner sc;

public static void main(String[] args) throws FileNotFoundException
{

	sc = new Scanner(new File("test.txt"));
	sc.useDelimiter(" ");
	int count=0;
	System.out.println("Counting number of words from File Test.txt \n");
	while(sc.hasNext())
	{
		String word=sc.next();
		//Matches length of word to 4
		//If true, increment the count
		if(word.length()==4)
		{
			count++;
		}
	}
	System.out.println("Total Number of words in given Text file are :"+count);
	
	
}
}