import java.io.*;
import java.util.*;

public class DinnerTable{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
       Scanner sc= new Scanner(System.in);
       String s1=sc.nextLine();
       String s2=sc.nextLine();
       double[] plate1= Arrays.stream(s1.split(" ")).mapToDouble(Double:: parseDouble).toArray();
       double[] plate2= Arrays.stream(s2.split(" ")).mapToDouble(Double :: parseDouble).toArray();
       double x=0,y=0;
       double radiisum= plate1[2]+plate2[2];
       for(int i=0; i< plate1.length-1; i++)
       {
            x= Math.abs(plate1[i]-plate2[i]);
            y+=x*x;
       }

	if(Math.sqrt(y) >= radiisum)
       	System.out.println("YOU'RE ALL GOOD DAN");
	else
	System.out.println("TRY AGAIN DAN");
    }
}