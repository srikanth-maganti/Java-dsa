package queues;

public class queuel {
    static class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    static class Queue{
        Node head=null;
        Node tail=null;

        public boolean isempty()
        {
            return head==null && tail==null;

        }
        public void add(int data)
        {   Node newnode=new Node(data);
            if(head==null)
            {
                head=tail=newnode;
                return;
            }
           tail.next=newnode;
           tail=newnode;
        }

        public int remove()
        {
            if(isempty())
            {
                return -1;

            }
            int result=head.data;
            if(head==tail)
            {
                head=tail=null;
                return result;
            }
            
            head=head.next; 
            return result;

        }
        public int peek()
        {
            if(isempty())
            {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[])
    {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isempty())
        {
            System.out.println(q.remove());
        }
    }
}
