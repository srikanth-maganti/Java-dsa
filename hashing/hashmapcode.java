import java.util.LinkedList;
import java.util.ArrayList;
public class hashmapcode
{
    static class HashMap<K,V>{//k,v are generics
        private class Node
        {
            K key;
            V val;
            Node(K key,V val)
            {
                this.key=key;
                this.val=val;
            }
        }
       
        private int n;//
        private int N;
        private LinkedList<Node> buckets[];//N


        @SuppressWarnings("unchecked")
        public HashMap()
        {
            this.N=4;
            this.buckets=new LinkedList[4];//in some versions type of lineked list need to be specified so to supress warnings we use supress warnings  
            for(int i=0;i<4;i++)
            {
                this.buckets[i]=new LinkedList<>();
            }
        } 
        public int hashfunction(K key)
        {
            int num=key.hashCode();
            return Math.abs(num)%N;
        }

        public int searchinll(K key,int bi)
        {
            LinkedList<Node> ll=buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++)
            {
                Node node=ll.get(i);
                if(node.key==key)
                {
                    return di;
                }
                di++;
            }
            return -1;
        }


        //rehash
        @SuppressWarnings("unchecked")
        private void rehash()
        {
            LinkedList<Node> oldbuck[]=buckets;
            N=2*N;
            buckets=new LinkedList[N];
            for(int i=0;i<buckets.length;i++)
            {
                buckets[i]=new LinkedList<>();

            }

            for(int i=0;i<oldbuck.length;i++)
            {
                LinkedList<Node> ll=oldbuck[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node=ll.remove();
                    put(node.key,node.val);
                }
            }

        }
        public void put(K key,V val)
        {
            int bi=hashfunction(key);
            int di=searchinll(key,bi);
            if(di!=-1)
            {
                Node node=buckets[bi].get(di);
                node.val=val;
            }
            else
            {
                buckets[bi].add(new Node(key,val));
                n++;
            }
            double lambda=(double)n/N;
            if(lambda>2.0)
            {
                rehash();
            }
        }

        public boolean containsKey(K key)
        {
            int bi=hashfunction(key);
            int di=searchinll(key, bi);

            if(di!=-1)
            {return true;}
            else{return false;}
        }
        public V get(K key)
        {
            
            int bi=hashfunction(key);
            int di=searchinll(key,bi);
            if(di!=-1)
            {
                Node node=buckets[bi].get(di);
                return node.val;
            }
            else
            {
                return null;
            }
        }

        public V remove(K key)
        {
            
            int bi=hashfunction(key);
            int di=searchinll(key,bi);
            if(di!=-1)
            {
                Node node=buckets[bi].remove(di);
                n--;
                return node.val;
            }
            else
            {return null;
            }
        }

        public ArrayList<K> keySet()
        {   ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i<buckets.length;i++)
            {
                LinkedList<Node> ll=buckets[i];
                for(Node node:ll)
                {
                    keys.add(node.key);
                }
            }
            return keys;

        }
        public boolean isEmpty()
        {
            return n==0;
        }


    }
    public static void main(String args[])
    {
        HashMap<String ,Integer> hm=new HashMap<>();
        hm.put("india",34);
        hm.put("america",20);
        ArrayList<String> keys=hm.keySet();
        for(String k:keys)
        {
            System.out.println(k);
        }
        System.out.println(hm.get("india"));
        System.out.println(hm.remove("america"));


    }
}