import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    String str = sc.nextLine();
    LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<Character,Integer>();
    StringBuilder sb= new StringBuilder();
    for(int i=0;i<str.length();i++)
     {
        if(lhm.containsKey(str.charAt(i)))
        lhm.put(str.charAt(i),lhm.get(str.charAt(i))+1);
        else
        lhm.put(str.charAt(i),1);     
    }
        
    Iterator i = lhm.entrySet().iterator();
    while(i.hasNext())
    {
        Map.Entry m=(Map.Entry)i.next();
        if(((int)m.getValue() & 1) != 0)
            sb.append(m.getKey());
        
    }
    if(sb.toString().isEmpty())
    System.out.println("Empty String");
    else
    System.out.println(sb.toString());
    
    }
}