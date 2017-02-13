import java.io.*;
import java.util.*;

public class SimpleSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
       Scanner sc=new Scanner(System.in);
       String input= sc.nextLine();
       int[] arr = Arrays.stream(input.split(" "))
    		   .mapToInt(Integer::parseInt)
    	       .toArray();
       
       int sum=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>0)
            {
               sum += arr[i];
            }
       }
        
       System.out.println(sum);
    
    }
}