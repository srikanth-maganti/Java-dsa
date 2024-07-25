public class subtree {
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
    public static boolean isidentical(Node root,Node subroot)
    {
        if(root==null&& subroot==null )
        {
            return true;
        }
        else if(root==null || subroot==null || root.data!=subroot.data)
        {
            return false;
        }
        if(!isidentical(root.left, subroot.left))
        {
            return false;
        }
        if(!isidentical(root.right, subroot.right))
        {
            return false;
        }
        return true;
    }
    public static boolean issubtree(Node root,Node subroot)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==subroot.data)
        {
            if(isidentical(root,subroot))
            {
                return true;
            }
        }
        return issubtree(root.left, subroot) || issubtree(root.right, subroot);
    }
    public static void main(String[] args) {
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);
        root1.left.left=new Node(4);
        root1.left.right=new Node(5);
        root1.right.right=new Node(6);

        Node root2=new Node(2);
        root2.left=new Node(4);
        // root2.right=new Node(5);

        System.out.println(issubtree(root1,root2));
        
    }
}
