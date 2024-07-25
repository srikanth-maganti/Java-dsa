package heapandpq;
import java.util.*;
public class weaksoldier {
    static class Row implements Comparable<Row>
    {   int soldiers;
        int idx;
        Row(int soldiers,int idx)
        {
            this.soldiers=soldiers;
            this.idx=idx;
        }
        @Override
        public int compareTo(Row r2)
        {
            if(r2.soldiers==this.soldiers)
            {
                return this.idx-r2.idx;
            }
            return this.soldiers-r2.soldiers;
        }
    }
    public static void main(String args[])
    {   int k=2;
        int army[][]={{1,0,0,0},
                    {1,1,1,1},
                    {1,0,0,0},
                     {1,0,0,0}};
        PriorityQueue<Row> pq=new PriorityQueue<>(); 
        for(int i=0;i<army.length;i++)
        {   int count=0;
            for(int j=0;j<army[i].length;j++)
            {
                count+=army[i][j]==1?1:0;
            }
            pq.add(new Row(count,i));

        }

        for(int i=0;i<k;i++)
        {
            System.out.println(pq.peek().idx);
            pq.remove();
        }
    }
}
