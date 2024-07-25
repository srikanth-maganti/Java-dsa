package stack;
import java.util.*;

public class duplicateparen {
    public static boolean isduplicate(String str)
    {   Stack<Character> s=new Stack<>();
        int count=0;
        for(int i=0;i<str.length();i++)
        {   char ch=str.charAt(i);
            if(ch==')')
            {   count=0;
                while(s.pop()!='(')
                {
                    
                    count++;
                }
                if(count<1)
                {
                    return true;
                }
                
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="(a+b)";
        String str1="((a+b))";


        System.out.println(isduplicate(str1));
    }
}
