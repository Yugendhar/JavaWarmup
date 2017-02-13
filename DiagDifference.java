// Diagonal sum difference for NxN size array
// Modulus of difference is the output


import java.io.*;
import java.util.*;

public class DiagDifference{

    private static Scanner scan;

	public static void main(String[] args) {
        scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[][] = new int[size][size];
	for(int i =0 ; i < size; i++ )
            {
              for(int j = 0; j< size;j++ )
                  {
			arr[i][j] = scan.nextInt();
		}
	}
        int leftsum = 0, rightsum = 0 ;
        for(int i =0 ; i < size; i++ )
            {
              for(int j = 0; j< size;j++ )
                  {
                   if(i == j)
                       {
                       leftsum += arr[i][j];  
                   }
                  if((i+j) == size-1 )
                      {
                      rightsum += arr[i][j];
                  }
              }
        }
        
        int diff = rightsum-leftsum;
            if (diff<0)
            diff=-(diff);
System.out.println(diff); 
        } 
}