package FindWords;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FindNumberofWords
{
	
private static Scanner sc;

public static void main(String[] args) throws FileNotFoundException
{
	//Input Test file to process
	sc = new Scanner(new File("test.txt"));
	
	//using new line as delimiter to separate input text from test.file
	sc.useDelimiter("\n");
	
	System.out.println("Counting number of words from File Test.txt \n");
	while(sc.hasNext())
	{
	  String line=sc.next();
	 
	  String[] words= line.trim().split("\\s+")		  ;
	  System.out.println(Arrays.toString(words));
	  System.out.println("Length is "+words.length);
	  
	  
	  //Below is another approach
	  /* Looping through and finding count
	   int count=0;
	  String[] words= line.trim().split(" ");
	  count=0;
	 
	  for(int i=0;i<words.length;i++)
	  {
		  if(words[i]!=null && !words[i].isEmpty())
		  {
			//System.out.print(words[i]+"/");
		  count++;
		  }
	  }
	  System.out.println(count);
	  */

	}	
}
}