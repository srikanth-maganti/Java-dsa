package tries;

public class countunique {
    public static class Node{
        Node children[];
        boolean eow;
        Node()
        {
            this.children=new Node[26];
            for(int i=0;i<26;i++)
            {
                this.children[i]=null;
            }
            this.eow=false;
        }
    }
    public static Node root=new Node();

    public static void insert(String str)
    {
        Node curr=root;
        for(int i=0;i<str.length();i++)
        {
            int idx=str.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx]=new Node();
            }
            if(i==str.length()-1)
            {
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }
    public static int countnoofnodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(root.children[i]!=null)
            {
                count+=countnoofnodes(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String args[])
    {
        String str="ababa";
        for(int i=0;i<str.length();i++)
        {
            insert(str.substring(i));

        }

        System.out.println(countnoofnodes(root));
    }
}
