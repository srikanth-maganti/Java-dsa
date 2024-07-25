package linkedlist;

public class doublell {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node (int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public Node head;
    public Node tail;
    public int size;


    //add first

    public void addfirst(int data)
    {
        //create newnode
        Node newnode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            return;

        }

        head.prev=newnode;
        newnode.next=head;
        head=newnode;
    }

    //add last
    public void addlast(int data)
    {   size++;
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
    }

    //remove first
    public int removefirst()
    {   
        if(head==null)
        {
            System.out.println("dll is empty");
            return Integer.MAX_VALUE;
        }

        if(size==1)
        {   int val=head.data;
            head=tail=null;
            size--;
            return val;
            
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;

    }

    //remove last
    public int removelast()
    {
        if(tail==null)
        {
            return Integer.MAX_VALUE;
        }
        if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=tail.data;

        tail=tail.prev;
        tail.next=null;

        size--;
        return val;

    }

    public void reverse()
    {
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        tail=head;
        head=prev;


    }

    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {   System.out.print(temp.data+" <--> ");
             temp=temp.next;

        }
        System.out.print("null");
        System.out.println();

    }
    public static void main(String[] args) {
        doublell dll=new doublell();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);

        dll.print();
        dll.reverse();
        dll.removelast();
        dll.print();
    }
}
