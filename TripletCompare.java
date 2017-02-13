import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TripletCompare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int aScore,bScore=0;
        
        aScore = compareScores(a0,b0)+compareScores(a1,b1)+compareScores(a2,b2);
        bScore = compareScores(b0,a0)+compareScores(b1,a1)+compareScores(b2,a2);
        System.out.println(aScore+" "+bScore);
       }
        
        static int compareScores(int a, int b)
            {
            if(a>b)
            return 1;
            else
              return 0;
        }     
}
