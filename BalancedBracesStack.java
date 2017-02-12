import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBracesStack{
    
    public static boolean isBalanced(String expression) {
        if(expression.length()%2!=0)
            return false;
        Stack<Character> stack =new Stack<>();
       for(char c : expression.toCharArray())
           {
           if(c=='('||c=='{'||c=='[')
               stack.push(c);
           if(c==')')
               if(stack.isEmpty()||stack.pop()!='(')
               return false;
           if(c=='}')
               if(stack.isEmpty()||stack.pop()!='{')
                return false;
           if(c==']')
               if(stack.isEmpty()||stack.pop()!='[')
               return false;
            }
        return stack.isEmpty();          
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
