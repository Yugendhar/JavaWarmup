
//Java -2 power 31 to 2 power 31 -1
//Java 8 0 to 2 power 32 -1
/*Sample Input
5
1000000001 1000000002 1000000003 1000000004 1000000005

Output

5000000015*/

import java.io.*;
import java.util.*;

public class VeryBigSum{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner  scan = new Scanner(System.in);
    long input[] = new long[scan.nextInt()];
      long sum = 0;
          for (int i =0; i < input.length ; i++)
           {
           input[i]= scan.nextInt();
       }
      
       for (int i =0; i < input.length ; i++)
           {
           sum += input[i];
       }
           System.out.println(sum);
       }
    
        
    
    
    
}