package linkedlist;

public class LinkedList {
    int size=0;
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
               this.data=data;
                this.next=null;
        }
    }

    public Node head;
    public Node tail;

    public void addfirst(int data)
    {
        Node newnode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
        

    }

    public void addlast(int data)
    {
        Node newnode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;
        }
       
    }

    public void printll()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();

    
    }
    public void add(int idx,int data)
    {   Node newnode=new Node(data);

        if(idx==0)
        {
            addfirst(data);
            return;
        }
        int i=0;
        Node temp=head;
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        size++;


        
    }

    public int removefirst()
    {
        if(size==0)
        {
            System.out.println("linked list not existed");
            return Integer.MAX_VALUE;
        }
        else if(size==1)
        {   int val=head.data;
            size--;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val; 

    }

    public int removelast()
    {
        if(size==0)
        {
            return Integer.MAX_VALUE;
        }
        else if(size==1)
        {
            int val=tail.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=tail.data;
        Node temp=head;
        for(int i=0;i<size-2;i++)
        {
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
        return val;

    }

    public int helper(Node head,int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1)
        {
            return -1;
        }
        return idx+1;

    }

    public int recsearch(int key)
    {
        return helper(head,key);
    }
    public int itersearch(int key)
    {
        Node temp=head;
        int idx=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
    }

    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void deletenthfromlast(int n)
    {   //calculating size
        Node temp=head;
        int sz=0;
        while(temp!=null)
        {
            temp=temp.next;
            sz++;
        }

        int ithnode=sz-n;
        temp=head;
        for(int i=1;i<ithnode;i++)
        {
            temp=temp.next;
        }

        temp.next=temp.next.next;



    }

    public Node findmid(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;


        }
        return slow;
    }

    public boolean palindrome()
    {
        if(head==null || head.next==null)
        {
            return true;
        }
        //find midnode
        Node midnode=findmid(head);

        
        //reverse the linked list
        Node curr=midnode;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;
        Node left=head;



        //check

        while(right!=null)
        {
            if(right.data!=left.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }

        return true;

    }




    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        // ll.addfirst(1);
        // ll.printll();

        // ll.addlast(2);
        // ll.printll();
        // ll.addlast(3);
        // ll.printll();
        // ll.addfirst(2);
        // ll.add(1,9);
        // ll.printll();
        // ll.removefirst();
        // ll.printll();
        // ll.removelast();
        // ll.printll();
        // System.out.println(ll.size);

        // System.out.println(ll.itersearch(2));
        // System.out.println(ll.recsearch(2));

        // ll.reverse();
        // ll.printll();

        // ll.deletenthfromlast(2);


        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(2);
        ll.addlast(1);

        System.out.println(ll.palindrome());
        ll.printll();
        



    }
}
