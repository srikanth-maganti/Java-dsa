import java.util.*;
public class topview
{
    public static class Node{
        int data;
        Node left;
        Node right;

        Node (int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class Info{
        int hd;
        Node node;

        public Info(int hd,Node node)
        {
            this.hd=hd;
            this.node=node;
        }
    }
    public static void findtopview(Node root)
    {
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0;
        int max=0;
        if(root==null)
        {
            return;
        }

        q.add(new Info(0,root));
        while(!q.isEmpty())
        {
            Info curr=q.remove();
            if(!map.containsKey(curr.hd))
            {
                map.put(curr.hd,curr.node);
            }
            if(curr.node.left!=null)
            {
                q.add(new Info(curr.hd-1,curr.node.left));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null)
            {
                q.add(new Info(curr.hd+1,curr.node.right));
                max=Math.max(max,curr.hd+1);
            }

        }
        for(int i=min;i<=max;i++)
        {
            System.out.print(map.get(i).data+" ");
        }




    }

   
    public static void main(String args[])
    {
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);
        root1.left.left=new Node(4);
        root1.left.right=new Node(5);
        root1.right.right=new Node(6);

        findtopview(root1);
        System.out.println("--------");
       
    }
}