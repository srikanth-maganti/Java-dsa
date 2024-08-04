public class disjoint {
    static int n=8;
    static int rank[]=new int[n];
    static int par[]=new int[n];

    public static void init()
    {
        for(int i=0;i<n;i++)
        {
            rank[i]=0;
            par[i]=i;
        }
    }

    public static int find(int x)
    {
        if(x==par[x])
        {
            return x;
        }
        return par[x]=find(par[x]);
    }

    public static void union(int a,int b)
    {
        int para=find(a);
        int parb=find(b);
        if(rank[para]==rank[parb])
        {
            par[parb]=para;
            rank[para]++;

        }
        else if(rank[para]<rank[parb])
        {
            par[para]=parb;
        }
        else
        {
            par[parb]=para;
        }
    }
    public static void main(String args[])
    {   init();
        union(1,3);
        System.out.println(find(3));
        System.out.println(find(4));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(4));
        union(1,5);
        System.out.println(find(5));
    }
}
