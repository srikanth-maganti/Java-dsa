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

    public static Node root;
    public static void main(String[] args) {
        
    }
}
