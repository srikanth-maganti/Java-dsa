package stack;
 

import java.util.*;

public class Stackb {
   static class Stack
    {
        ArrayList<Integer> list=new ArrayList<>();
        

        public void push(int data)
        {
            list.add(data);
        }

        public int pop()
        {   if(isempty())
            {
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

        }

        public int peek()
        {
            return list.get(list.size()-1);
        }
        public boolean isempty()
        {
            if(list.size()==0)
            {
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(11);
        s.push(12);
        s.push(13);

        Stack s1=new Stack();
        s1.push(1);
        s1.push(2);


        while(!s.isempty())
        {
            System.out.println(s.pop());
        }
        System.out.println();
        while(!s1.isempty())
        {
            System.out.println(s1.pop());
            
        }
    }
}
