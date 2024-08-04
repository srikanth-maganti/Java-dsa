package graphs;
import java.util.*;

public class bipartite {
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
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        //vertex1
        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,0));

        //vertex2
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,0));

        //vertex3
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));

    }

    public static boolean isbipartite(ArrayList<Edge> graph[])
    {
        int col[]=new int[graph.length];
        
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<col.length;i++)
        {
            col[i]=-1;
        }
        for(int i=0;i<graph.length;i++)
        {
            if(col[i]==-1)
            {   
                q.add(i);
                col[i]=0; //yelllow
                while(!q.isEmpty())
                {
                    int curr=q.remove();
                    for(int j=0;j<graph[curr].size();j++)
                    {
                        Edge e=graph[curr].get(j);
                        if(e.dest==-1)
                        {
                            col[e.dest]=col[j]==0?1:0;
                            q.add(e.dest);
                        }
                        if(col[curr]==col[e.dest])
                        {
                            return false;
                        }

                    }
                }
            }
        }


        return true;


    }
    public static void main(String args[])
    {
        ArrayList<Edge> graph[]=new ArrayList[5];
        creategraph(graph);
        System.out.println(isbipartite(graph));
    }
}
