import java.util.*;
public class problemset2 {
    
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

    //print kth level in binary treee
    public static void klevel(Node root,int level,int k)
    {
        if(root==null)
        {
            return;
        }
        if(k==level)
        {
            System.out.print(root.data+"  ");
            return;
        }
        klevel(root.left,level+1,k);
        klevel(root.right,level+1,k);

    }


    //lowest common ancester
    public static boolean getpath(Node root,int n,ArrayList<Node> path)
    {
        if(root==null)
        {
            return false;
        }
        path.add(root);
        if(root.data==n)
        {
            return true;
        }
        boolean left=getpath(root.left,n,path);
        boolean right=getpath(root.right,n,path);
        if(left||right)
        {
            return true;
        }
        path.remove(path.size()-1);
        return false; 
    }
    public static Node lca(Node root,int n1,int n2)
    {
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getpath(root,n1,path1);
        getpath(root,n2,path2);
        int i=0;
        for(i=0;i<path1.size() && i<path2.size();i++)
        {
            if(path1.get(i)!=path2.get(i))
            {
                break;
            }
        }
        return path1.get(i-1);
    }


    //lowest common ancester:approch2
    public static Node lca2(Node root,int n1,int n2)
    {
        if(root==null||root.data==n1 || root.data==n2)
        {
            return root;
        }
        Node left=lca2(root.left,n1,n2);
        Node right=lca2(root.right,n1,n2);

        if(left==null)
        {
            return right;
        }
         if(right==null){
            return left;
        }
        
        return root;
        


    }


    //min distance between nodes
    public static int distance(Node root,int n)
    {
        if(root==null)
        {
            return -1;
        }
        if(root.data==n)
        {
            return 0;
        }

        int left=distance(root.left,n);
        int right=distance(root.right,n);

        if(left==-1&& right==-1)
        {
            return -1;

        }
        else if(left==-1)
        {
            return right+1;
        }
        else
        {
            return left+1;
        }

    }
    public static int mindistance(Node root,int n1,int n2)
    {   Node lca=lca2(root,n1,n2);
        int dist1=distance(lca,n1);
        int dist2=distance(lca,n2);
        return dist1+dist2;
    }



    //kth ancester of a node
    public static int Kancester(Node root,int n,int k)
    {   if(root==null)
        {
            return -1;
        }
        if(root.data==n)
        {
            return 0;
        }
        int left=Kancester(root.left, n, k);
        int right=Kancester(root.right, n, k);

        if(left==-1&& right==-1)
        {
            return -1;
        }
        int max=Math.max(left,right);
        if(max+1==k)
        {
            System.out.println(root.data);
        }
        return max+1;
        
    }


    //transform to sum tree
    public static int sumtree(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int leftchild=sumtree(root.left);
        int rightchild=sumtree(root.right);
        int data=root.data;
        int newleft=root.left==null?0:root.left.data;
        int newright=root.right==null?0:root.right.data;
        root.data=leftchild+newleft+rightchild+newright;
        return data;

    }
    

    public static void main(String[] args) {
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);
        root1.left.left=new Node(4);
        root1.left.right=new Node(5);
        root1.right.right=new Node(6);
        klevel(root1,1,3);
        System.out.println();
        System.out.println(lca(root1,4,5).data);
        System.out.println(lca2(root1,4,5).data);
        System.out.println(mindistance(root1, 4, 6));
        Kancester(root1, 5, 2);

        sumtree(root1);
        System.out.println(root1.data);
    }
}
