import java.io.*;
import java.util.*;

public class Unique{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc= new Scanner(System.in);
    String input= sc.nextLine();//aaaAAbbB =2    

HashSet<Character> hs = new HashSet<Character>();

for(int i=0;i<input.length();i++)
{
	hs.add(Character.toLowerCase(input.charAt(i)));
}

System.out.println(hs.size());
System.out.println(hs);
}

}