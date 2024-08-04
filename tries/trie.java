package tries;

public class trie {
    static class Node{
        Node children[];
        boolean eow;
        public Node()
        {
            this.children=new Node[26];
            for(int i=0;i<26;i++){
                this.children[i]=null;
            }
            this.eow=false;
        }
    }

    public static Node root=new Node();
    public static void insert(String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {   int idx=word.charAt(i)-'a';
            Node node=curr.children[idx];
            if(node==null)
            {
                curr.children[idx]=new Node();
            }
            if(i==word.length()-1)
            {
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }

    public static boolean search(String str)
    {
        Node curr=root;
        for(int i=0;i<str.length();i++)
        {
            int idx=str.charAt(i)-'a';
            Node node=curr.children[idx];
            if(node==null)
            {
                return false;
            }
            if(i==str.length()-1 && node.eow==false)
            {
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static boolean wordbreak(String key)
    {
        if(key.length()==0)
        {
            return true;
        }
        for(int i=1;i<=key.length();i++)
        {
            String firstpart=key.substring(0, i);
            String secpart=key.substring(i);
            if(search(firstpart) && wordbreak(secpart))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean startswith(String prefix)
    {
        Node curr=root;
        for(int i=0;i<prefix.length();i++)
        {
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static String ans="";
    public static void longestword(Node root,StringBuilder temp)
    {
        for(int i=0;i<26;i++)
        {
            if(root.children[i]!=null && root.children[i].eow)
            {
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length())
                {
                    ans=temp.toString();
                }
                longestword(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        // String words[]={"a","the","their","there","the"};
        // for(String word:words)
        // {
        //     insert(word);
        // }
        // System.out.println(search("a"));
        // System.out.println(search("thee"));
        // System.out.println(search("their"));

    //     String words[]={"i","like","sam","samsung"};
    //     for(String w:words){
    //             insert(w);
    //     }

    //     System.out.println(wordbreak("ilikesamsung"));


        // String words[]={"mango","app","apple"};
        // for(String s:words){
        //     insert(s);
        // }
        // System.out.println(startswith("app"));

        String words[]={"a","ap","app","banana","apple","appl","apply"};
        for(String str:words)
        {
            insert(str);
        }

        longestword(root, new StringBuilder(""));
        System.out.println(ans);
        
     }   
}
