package stack;

public class Stackl {
    static class Node
    {
        int data;
        Node next;
        public  Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    static  class Stack
    {
        Node head=null;


        //push
        public void push(int data)
        {       Node newnode=new Node(data);
               if(head==null)
               {
                head=newnode;
                return;
               }
               newnode.next=head;
               head=newnode;
               
        }

        //pop
        public int  pop()
        {   if(head==null)
            {
                return Integer.MIN_VALUE;
            }
            int val=head.data;
            head=head.next;
            return val;

        }

        public boolean isempty()
        {
            if(head==null)
            {
                return true;
            }
            return false;
        }

        //peek
        public int peek()
        {
            if(head==null)
             {       
            return Integer.MAX_VALUE;
            }
            return head.data;
        }

    } 
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isempty())
        {
            System.out.println(s.pop());
        }
        
        
    }

}
