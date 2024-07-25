package linkedlist;

public class detectloop {
      public static class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }}
    

        public static Node head=null;
        public Node tail=null;

    public static boolean isloopexist(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {   fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {return true;

            }
        }
        return false;

    }


    public static void removecycle()
    {
        //check cycle

        Node slow=head;
        Node fast=head;
        boolean cycleexists=false;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                cycleexists=true;
                break;
            }
        }
        if(cycleexists==false)
        {
            return;
        }

        //remove cycle

        
        Node prev=null;
        slow=head;
        while(slow!=fast)
        {   prev=fast;
            slow=slow.next;
            fast=fast.next; 
        }
        prev.next=null;
        
    }
    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;

        System.out.println(isloopexist(head));
        removecycle();
        System.out.println(isloopexist(head));


    }
      
    
}
