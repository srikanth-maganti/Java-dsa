package binarysearchtree;

public class sizeoflargestbst {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public static class Info{
        boolean isbst;
        int size;
        int min;
        int max;
        Info(boolean isbst,int size,int min,int max)
        {
            this.isbst=isbst;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    static int maxbst=0;
    public static Info largestbst(Node root)
    {
        if(root==null)
        {
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info left=largestbst(root.left);
        Info right=largestbst(root.right);
     
        int size=left.size+right.size+1;
        int max=Math.max(Math.max(root.data,left.max),right.max);
        int min=Math.min(Math.min(root.data,left.min),right.min);
        if(left.max>=root.data|| right.min<=root.data)
        {
            return new Info(false,size,min,max);
        }
        if(left.isbst && right.isbst)
        {   maxbst=Math.max(maxbst,size);
            return new Info(true,size,min,max);
        }
        return new Info(true,size,min,max);

    }
    public static void main(String args[])
    {
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(60);
        root.left.left=new Node(5);
        root.left.right=new Node(20);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);

        Info n=largestbst(root);
        System.out.println(maxbst);



    }
    
}
