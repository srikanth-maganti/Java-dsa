package graphs;

import java.util.ArrayList;

public class allpaths {
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
        graph[0].add(new Edge(0,3));


        //vertex4
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,0));

        //vertex 5
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void findallpaths(ArrayList<Edge> graph[],int src,int dest,String path)
    {
        if(src==dest)
        {
            System.out.println(path+dest);
            return;
        }

        for(int i=0;i<graph[src].size();i++)
        {
            Edge e=graph[src].get(i);
            findallpaths(graph,e.dest,dest,path+src);
        }

    }
    public static void main(String args[])
    {
        ArrayList<Edge> graph[]=new ArrayList[6];
        creategraph(graph);

        findallpaths(graph,5,1,"");
    }
}
