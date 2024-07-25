package binarysearchtree;
import java.util.*;
public class mergebst {
    static class Node{
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
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void inorder(Node root,ArrayList<Integer> list)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }

    public static Node createbst(ArrayList<Integer> arr,int st,int end)
    {
        if(st>end)
        {
            return null;
        }
        int mid=(st+end)/2;

        Node root=new Node(arr.get(mid));
        root.left=createbst(arr,st,mid-1);
        root.right=createbst(arr,mid+1,end);
        return root;

    }
    public static Node merge(ArrayList<Integer> list1,ArrayList<Integer> list2)
    {
        int i=0;
        int j=0;
        ArrayList<Integer> finallist=new ArrayList<>();
        while(i<list1.size()&& j<list2.size())
        {
            if(list1.get(i)<list2.get(j))
            {
                finallist.add(list1.get(i));
                i++;
            }
            else{
                finallist.add(list2.get(j));
                j++;
            }

        }
        while(i<list1.size())
        {
            finallist.add(list1.get(i));
            i++;
        }
        while(j<list2.size())
        {
            finallist.add(list2.get(j));
            j++;
        }

        return createbst(finallist,0,finallist.size()-1);
    }

    public static Node mergebsts(Node root1,Node root2)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        inorder(root1,list1);

        ArrayList<Integer> list2=new ArrayList<>();
        inorder(root2,list2);

        
        return merge(list1,list2);
    }



    public static void main(String args[])
    {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(2);

        Node root=mergebsts(root1,root2);
        inorder(root);
        
    }
    
}
