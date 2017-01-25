import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindNumberofWords
{
	
private static Scanner sc;

public static void main(String[] args) throws FileNotFoundException
{
	//Input Test file to process
	sc = new Scanner(new File("test.txt"));
	
	//using space as delimiter to separate input text from test.file
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