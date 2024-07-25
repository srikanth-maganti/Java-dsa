package stack;
import java.util.*;


public class validparen {

        public static boolean checkvalidparenthesis(String str)
        {   Stack<Character> s=new Stack<>();
            for(int i=0;i<str.length();i++)
            {   char ch=str.charAt(i);
                //opening 
                if(ch=='(' || ch=='{' || ch=='[')
                {
                    s.push(ch);
                }
                else{

                    //closing
                    if(s.isEmpty())
                    {
                        return false;
                    }
                    if((s.peek()=='{' && ch=='}')|| (s.peek()=='(' && ch==')')|| (ch==']' && s.peek()=='['))
                    {
                        s.pop();
                    }
                    else{
                        return false;
                    }
                }
                
            }
            if(s.isEmpty())
                {
                    return true;
                }
                else{
                    return false;
                }
        }
        public static void main(String[] args) {
            System.out.println(checkvalidparenthesis("{()]}"));
        }
}
