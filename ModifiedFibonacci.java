import java.io.*;
import java.util.*;
import java.math.*;

public class ModifiedFibonacci{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc= new Scanner(System.in);     
        BigInteger a= BigInteger.valueOf(sc.nextInt());
        BigInteger b= BigInteger.valueOf(sc.nextInt());
        int n = sc.nextInt();
        BigInteger[] arr= new BigInteger[n];
        arr[0] = a;
        arr[1] = b;
        for(int i=2;i<n;i++)yo
        {
            arr[i]= BigInteger.valueOf(-1);     
        }
        BigInteger x= modifiedFibonacci(arr,n);
        System.out.println(arr[n-1]);
    }
    
   public static BigInteger modifiedFibonacci(BigInteger[] a, int n) 
        {
        if(a[n-1]!= BigInteger.valueOf(-1))
         return a[n-1];
        else
        {
             a[n-1]=modifiedFibonacci(a,n-1).pow(2).add(modifiedFibonacci(a,n-2)); 
             return a[n-1];
        }
            
    }
}