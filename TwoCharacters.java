import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoCharacters{

//incomplete program

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        int count=0;
        HashSet<Character> hs= new HashSet<>();
        for(int i=1;i<s.length();i++)
            {
            if(s.charAt(i)==s.charAt(i-1))
                hs.add(s.charAt(i-1));
        }
        Iterator itr=hs.iterator();
        while(itr.hasNext())
        {
            s=s.replace(itr.next().toString(),"");
        }
       Map<Character, Integer> hm= new HashMap<>();
       
          for(int i=0;i<s.length();i++)
            {
              if(hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
               else
                  hm.put(s.charAt(i),1);
          }
        int sum=0;
        for(char c : hm.keySet())
            if(hm.get(c)>1)
            sum+=hm.get(c);
        System.out.println(sum);
        
        
    }
}
