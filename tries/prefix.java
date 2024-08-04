import java.util.*;
public class prefix
{
        public static class Node
        {
            Node children[];
            boolean eow;
            int freq;
            Node()
            {
                this.children=new Node[26];
                for(int i=0;i<26;i++)
                {
                    this.children[i]=null;
                }
                this.eow=false;
                this.freq=1;
            }
        }
        static Node root=new Node();

        public static void insert(String str)
        {   Node curr=root;
            for(int i=0;i<str.length();i++)
            {
                int idx=str.charAt(i)-'a';
                if(curr.children[idx]==null)
                {
                    curr.children[idx]=new Node();
                }
                else{
                    curr.children[idx].freq+=1;
                }
                curr=curr.children[idx];
            }
        }
        static ArrayList<String> ans=new ArrayList<>();
        public static  void prefixes(Node root,String temp)
        {
           for(int i=0;i<26;i++)
           {    
                if(root.children[i]!=null)
                {
                    if(root.children[i].freq==1)
                    {
                        ans.add(temp+(char)(i+'a'));
                        
                    }
                    else{
                        
                        prefixes(root.children[i],temp+(char)(i+'a'));
                        
                    }
                }
           }
        }
        public static void main(String args[])
        {
            String str[]={"zebra","dog","duck","dove"};
            for(String s:str)
            {
                insert(s);
            }
            prefixes(root,"");
            System.out.println(ans);
        }
    
}