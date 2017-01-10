import java.io.*;
import java.util.*;

//12 hours to military 24 hours format
//12:00:00AM -> 00:00:00
//12:00:00PM -> 12:00:00

public class TimeConversion{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        //String newtime="";
        String str1=str.substring(8);
        int hours=Integer.parseInt(str.substring(0,2));
        if((str1.equals("PM")&& hours<12)||(str1.equals("AM")&&hours==12))
            { 
            if(hours==12)
                hours = 0;
            else
                hours += 12;  
           System.out.println(hours < 10?"0"+hours+str.substring(2,8):hours+str.substring(2,8));
        }
        else
            System.out.println(str.substring(0,8));
    }
}