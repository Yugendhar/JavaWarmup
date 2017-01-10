import java.io.*;
import java.util.*;

public class Panagram{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc=new Scanner(System.in);
    String str= sc.nextLine();
    HashSet<Character> hs= new HashSet<Character>();
    for(int i =0;i< str.length();i++)
        {
            hs.add(Character.toLowerCase(str.charAt(i)));
    }
    if(hs.size()==26)
        System.out.println("panagram");
     else
         System.out.println("Not panagram");
    
    }
}