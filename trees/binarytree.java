import java.util.*;
public class binarytree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    }
    static class Binarytree{

        public int idx=-1;

        public Node buildtree(int arr[])
        {   idx++;
            if(arr[idx]==-1)
            {
                return null;
            }

            Node newnode=new Node(arr[idx]);
            newnode.left=buildtree(arr);
            newnode.right=buildtree(arr);
            return newnode;

        }
        
        public void preorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }
        public void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public void postorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");

        }

       
        public void levelorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                Node currnode=q.remove();
                if(currnode==null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currnode.data+" ");
                    if(currnode.left!=null)
                    {
                        q.add(currnode.left);
                    }
                    if(currnode.right!=null){
                        q.add(currnode.right);
                    }
                }
            }

        }
        public int height(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);

            return Math.max(lh,rh)+1;
        }

        public int count(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int lc=count(root.left);
            int rc=count(root.right);

            return lc+rc+1;
        }
        public int sum(Node root)
        {
            if(root==null)
            {
                return 0;
    
            }
            int lsum=sum(root.left);
            int rsum=sum(root.right);
            return lsum+rsum+root.data;
        }

        //diameter approch 1

        public int diameter(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int ldaim=diameter(root.left);
            int rdaim=diameter(root.right);
            int lh=height(root.left);
            int rh=height(root.right);

            int diam=Math.max(Math.max(ldaim,rdaim),lh+rh+1);

            return diam;

        }
        static class Info{
            int ht;
            int diam;
         public Info(int diam,int ht)
         {
            this.diam=diam;
            this.ht=ht;
         }
        }
        public Info diameter1(Node root)
        {
            if(root==null)
            {
                return new Info(0,0);
            }

            Info leftinfo=diameter1(root.left);
            Info rightinfo=diameter1(root.right);

            int diameter=Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.ht+rightinfo.ht+1);
            int height=Math.max(leftinfo.ht,rightinfo.ht)+1;
            return new Info(diameter,height);
        }

    }
   
    public static void main(String[] args)
    {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree=new Binarytree();
        Node root=tree.buildtree(arr);
        
        int arr2[]={3,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree2=new Binarytree();
        Node root2=tree2.buildtree(arr2);
        System.out.println(root.data);
        System.out.println(root2.data);

        tree.preorder(root);
        tree2.preorder(root2);

        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);

        System.out.println();
        tree.levelorder(root);


        System.out.println(tree.height(root));
        System.out.println(tree.count(root));

        System.out.println(tree.sum(root));
        // Binarytree.preorder(root);  if preorder is static 
        // Binarytree.preorder(root2);

        System.out.println(tree.diameter(root));
        System.out.println(tree.diameter1(root).diam);

    }

}       
