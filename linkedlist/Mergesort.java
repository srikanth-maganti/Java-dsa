package linkedlist;


public class Mergesort {
        public static class Node{
            int data;
            Node next;
            public Node(int data)
            {
                this.data=data;
                this.next=null;
            }
        }
        public  Node head;
        public Node tail;

        
        
        
        
        
        public static Node findmid(Node head)
        {
            Node slow=head;
            Node fast=head.next;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println(slow.data);
            return slow;
        }
        public static Node mergesort(Node head)
        {
            if(head==null || head.next==null)
            {
                return head;
            }


            //find mid

            Node midnode=findmid(head);
          

            //right half
            Node righthead=midnode.next;

            //spliting
            midnode.next=null;


            Node newleft=mergesort(head);
            Node newright=mergesort(righthead);

            
            return merge(newleft,newright);
            
        }

        public  static Node merge(Node head1,Node head2)
        {
            Node mergedll=new Node(-1);//dummy node creation
            Node temp=mergedll;
            while(head1!=null && head2!=null)
            {
                if(head1.data<=head2.data)
                {
                    temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;
                }
                else{
                    temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;
                }

            }
            while(head1!=null)
            {
                    temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;
            }
            while(head2!=null)
            {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
            
            return mergedll.next;
        }

        

        public static void main(String[] args) {
            Mergesort ll=new Mergesort();
            ll.addlast(1);
            ll.addlast(2);
            ll.addlast(3);
            ll.printll();
            System.out.println(ll.head.data);
            ll.head=mergesort(ll.head);
            ll.printll();
           
            
        }
        public void addlast(int data)
        {
            Node newnode=new Node(data);
            
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
    }