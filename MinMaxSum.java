import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long minsum=0,maxsum=0;
        TreeSet<Long> ts=new TreeSet<>();
        ts.add(a);
        ts.add(b);
        ts.add(c);
        ts.add(d);
        ts.add(e);
        Iterator it=ts.iterator();
        int count=0;
        while(it.hasNext()&&count<4)
            { 
            minsum+=(long)it.next();
            count++;
        }
        TreeSet rts=(TreeSet)ts.descendingSet();
         it=rts.iterator();
        count=0;
        while(it.hasNext()&&count<4)
            { 
             maxsum+=(long)it.next();
            count++;
        }
          System.out.println(minsum+" "+maxsum);
        
    }
}
