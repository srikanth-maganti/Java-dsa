package graphs;
import java.util.*;

public class topological {
    public static class Edge{
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
        //vertex1
        //vertex2
        graph[2].add(new Edge(2,3));

        //vertex3
        graph[3].add(new Edge(3,1));

        //vertex4
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,0));

        //vertex 5
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void topsort(ArrayList<Edge> graph[])
    {
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                topsortutil(graph,i,vis,s);
            }
        }

        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    }

    public static void topsortutil(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s)
    {
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!vis[e.dest])
            {
                topsortutil(graph,e.dest,vis,s);
            }
        }
        s.push(curr);

    }



    //topological sort using bfs
    public static void topsort2(ArrayList<Edge> graph[])
    {
        Queue<Integer> q=new LinkedList<>();
        int indeg[]=new int[graph.length];

        calcindeg(graph,indeg);

        for(int i=0;i<graph.length;i++)
        {
            if(indeg[i]==0)
            {
                q.add(i);
            }
        }

        while(!q.isEmpty())
        {
            int curr=q.remove();
            System.out.print(curr+" ");
            for(int i=0;i<graph[curr].size();i++)
            {
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0)
                {
                    q.add(e.dest);
                }
            }
        }
    }

    public static void calcindeg(ArrayList<Edge> graph[],int indeg[])
    {
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e=graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void main(String args[])
    {
        ArrayList<Edge> graph[]=new ArrayList[6];
        creategraph(graph);
        topsort(graph);
        System.out.println();
        topsort2(graph);
    }
}
