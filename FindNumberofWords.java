import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindNumberofWords
{
	
public static void main(String[] args) throws FileNotFoundException
{

	Scanner sc = new Scanner(new File("test.txt"));
	sc.useDelimiter(" ");
	int count=0;
	System.out.println("Counting number of words from File Test.txt \n");
	while(sc.hasNext())
	{
	  count++;
	  sc.next();
	  //System.out.println(sc.next());
	}
	System.out.println("Total Number of words in given Text file are :"+count);
	
	
}
}