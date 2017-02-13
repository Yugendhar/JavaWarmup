package FindWords;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindWordsBeginningLetter
{
	
private static Scanner sc;

public static void main(String[] args) throws FileNotFoundException
{

	sc = new Scanner(new File("test.txt"));
	sc.useDelimiter("\n");
	int count=0;
	while(sc.hasNext())
	{
		String line=sc.next();
		String[] words= line.trim().split("\\s+");	

		for(String w : words)
		{
		if(w.startsWith("a")||w.startsWith("A"))
		{
			count++;
		}
		}
		System.out.println(count);
		count=0;
	}	
}
}