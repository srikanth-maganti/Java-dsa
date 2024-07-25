package binarysearchtree;
public class BST2 {
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
    public static Node createbst(int arr[],int st,int end)
    {   
        if(st>end)
        {
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createbst(arr,st,mid-1);
        root.right=createbst(arr,mid+1,end);
        return root;

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
    public static void main(String args[])

    {

        int arr[]={1,2,4,5,6,7,9};
        Node root=createbst(arr,0,arr.length-1);
        inorder(root);
    }
}
