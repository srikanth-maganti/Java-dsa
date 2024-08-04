package graphs;
import java.util.*;


public class traversals {
    public static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt)
        {
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }


    }
    public static void creategraph(ArrayList<Edge> graph[])
    {   for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }

        //0
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        //1
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        //2
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        //3
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,5,1));
        graph[3].add(new Edge(3,4,1));

        //4
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,5,1));
        graph[4].add(new Edge(4,3,1));

        //5
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        //6
        graph[6].add(new Edge(6,5,1));



    }

    //breadth first search
    public static void bfs(ArrayList<Edge> graph[])
    {
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                bfsutil(graph,i,vis);
            }
        }

    }
    public static void bfsutil(ArrayList<Edge> graph[],int src,boolean vis[])
    {
        Queue<Integer> q=new LinkedList<>();
       
        q.add(src);
        while(!q.isEmpty())
        {
             int curr=q.remove();
            if(!vis[curr])
            {
                vis[curr]=true;
                System.out.print(curr+" ");
                for(int i=0;i<graph[curr].size();i++)
                {
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[])
    {
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                dfsutil(graph,i,vis);
            }
        }
    }
    public static void dfsutil(ArrayList<Edge> graph[],int curr,boolean vis[])
    {   System.out.print(curr+" " );
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!vis[e.dest])
            {
                dfsutil(graph,e.dest,vis);
            }
        }
    }
    public static boolean haspath(ArrayList<Edge> graph[],int src,int dest,boolean vis[])
    {
        if(src==dest)
        {
            return true;
        }
        vis[src]=true;

        for(int i=0;i<graph[src].size();i++)
        {
            Edge e=graph[src].get(i);
        //e.dest is neighbour
            if(!(vis[e.dest]) && haspath(graph,e.dest,dest,vis))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        creategraph(graph);

        bfs(graph);
        dfs(graph);
        System.out.println(haspath(graph,0,7,new boolean[V]));
    }
    
}


