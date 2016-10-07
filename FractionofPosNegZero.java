import java.io.*;
import java.util.*;

public class FractionofPosNegZero{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int s =  scan.nextInt();
        int p = 0 ,n= 0,z=0; 
        int arr[] = new int[s];
        for (int i = 0 ; i< s;i++)
            {
            arr[i]=scan.nextInt();
            if(arr[i] > 0)
            p++;
            else if(arr[i] < 0)
            n++; 
            else
             z++; 
        }
 
        System.out.println((float)p/s);
        System.out.println((float)n/s);
        System.out.println((float)z/s);
    }
    
}