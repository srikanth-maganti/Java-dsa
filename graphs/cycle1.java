package graphs;
import java.util.*;

public class cycle1 {
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
        }
    }


    public static void creategraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }


        //vertex0
        graph[1].add(new Edge(1,0));

        //vertex3
        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,2));

        //vertex2
        graph[2].add(new Edge(2,0));


    }



    public static boolean iscycle(ArrayList<Edge> graph[])
    {
        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                if(iscycleutil(graph,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean iscycleutil(ArrayList<Edge> graph[],int curr,boolean vis[],boolean stack[])
    {
        vis[curr]=true;
        stack[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(stack[e.dest])
            {
                return true;

            } 
            if(!vis[e.dest] && iscycleutil(graph,e.dest,vis,stack))
            {
                return true;
            }
        }
        stack[curr]=false;
        return false;
    }

    public static void main(String args[])
    {
        ArrayList<Edge> graph[]=new ArrayList[4];
        creategraph(graph);
        System.out.println(iscycle(graph));
    }
}
