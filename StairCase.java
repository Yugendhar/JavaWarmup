import java.io.*;
import java.util.*;

public class StairCase{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
       int input= Integer.parseInt(sc.nextLine());
       for(int i=0;i<input;i++)
        {
           for(int j=1;j<=input;j++)
               System.out.print( j< input-i?" ": "#");
           System.out.println();
       }
       
        
    }
}