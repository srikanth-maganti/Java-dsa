package binarysearchtree;
import java.util.*;

public class BST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        { this.data=data;
            this.left=null;
            this.right=null;


        }
    }

    //insert val
    public static Node insert(Node root,int val)
    {
        if(root==null)
        {
            root=new Node(val);
            return root;
        }

        if(root.data<val)
        {
            root.right=insert(root.right,val);
        }
        else if(root.data>val)
        {
            root.left=insert(root.left,val);
        }
        return root;
    }


    //inorder traversal
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    //search 
    public static boolean search(Node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==key)
        {
            return true;
        }
        if(root.data<key)
        {
            return search(root.right,key);
        }
        else{
            return search(root.left,key);//returning true or false to upper levels
        }
    }


    //delete node
    public static Node delete(Node root,int val)
    {   if(root==null)
        {
            return null;
        }
        if(root.data<val)
        {
            root.right=delete(root.right,val);
        }
        else if(root.data>val)
        {
            root.left=delete(root.left,val);
        }
        else
        {
            //case1
            if(root.left==null && root.right==null)
            {
                return null;
            }
            
            //case2
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }


            //case 3
            Node is=findinordersuccessor(root.right);
            root.data=is.data;
           root.right= delete(root.right,is.data);
        }
        return root;
    }

    public static Node findinordersuccessor(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }


    //print in range
    public static void printinrange(Node root,int k1,int k2)
    {
        if(root==null)
        {
            return;

        }

        //case1
        if(k1<=root.data && root.data<=k2)
        {
            printinrange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printinrange(root.right,k1,k2);
        }
        //case2
        else if(root.data>k2)
        {
            printinrange(root.left,k1,k2);
        }
        //case3
        else
        {
            
            printinrange(root.right,k1,k2);
        }
    }


    //
    public static void printpath(Node root,ArrayList<Integer> path)
    {
        if(root==null)
        {
            return ;
        }
        path.add(root.data);
        if(root.left==null && root.right==null)
        {
            System.out.println(path);
        }

        printpath(root.left,path);
        printpath(root.right,path);
        path.remove(path.size()-1);
    }


    //is valid bst
    public static boolean isvalidbst(Node root,Node min,Node max)
    {
        if(root==null)
        {
            return true;
        }
        if(min!=null && min.data>=root.data)
        {
            return false;
        }
        if(max!=null && max.data<=root.data)
        {
            return false;
        }
        return isvalidbst(root.left,min,root)&& isvalidbst(root.right,root,max);
    }


    //mirror image
    public static Node mirror(Node root)
    {   if(root==null)
        {
            return null;
        }
        if(root.left==null && root.right==null)
        {
            return root;
        }
        
        Node left= mirror(root.left);
        Node right=mirror(root.right);
        root.left=right;
        root.right=left;

        return root;
    }
    public static void main(String args[])
    {   Node root=null;
        int values[]={8,5,3,1,4,6,10,11,14};
        for(int i=0;i<values.length;i++)
        {
           root= insert(root,values[i]);
        }
        // inorder(root);
        // if(search(root,7))
        // {
        //     System.out.println("found");

        // }
        // else{
        //     System.out.println("not found");
       // }
        // System.out.println();
        // root=delete(root,10);
        // inorder(root);
        // System.out.println();
        printinrange(root,10,12);
        printpath(root,new ArrayList<>());
        System.out.println(isvalidbst(root,null,null));
        System.out.println();
        root=mirror(root);
        inorder(root);
    }
}
