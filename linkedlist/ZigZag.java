package linkedlist;

public class ZigZag{

        public static class Node{
            int data;
            Node next;
            public Node(int data)
            {
                this.data=data;
                this.next=null;
            }
        }

        public static Node head;
        public static Node tail;
     
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


        public static void zigzag()
        {
            //find mid
            Node slow=head;
            Node fast=head.next;

            while(fast!=null && fast.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
            }

            Node mid=slow;
            

            //reverse second half
            Node curr=mid.next;
            mid.next=null;
            Node prev=null;
            Node next;

            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }

            //alternative merging

            Node right=prev;
            Node left=head;
            Node nextl,nextr;
            while(right!=null && left !=null)
            {
                nextl=left.next;
                left.next=right;
                nextr=right.next;
                right.next=nextl;


                left=nextl;
                right=nextr;
            }

        }
        public static void main(String[] args) {
            ZigZag ll=new ZigZag();
            ll.addlast(1);
            ll.addlast(2);
            ll.addlast(3);

            ll.addlast(4);
            ll.printll();
            ll.zigzag();
            ll.printll();

            
           
            
        }
    }
