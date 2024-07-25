package stack;
import java.util.*;
public class reversestr {
    public static String reverse(String str)
    {
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        } 
        StringBuilder temp=new StringBuilder("");  
        while(!s.isEmpty())
        {
            temp.append(s.pop());
        }

        return temp.toString();
    }
    public static void main(String args[])
    {

        System.out.println(reverse("abc"));
    }
    
}
