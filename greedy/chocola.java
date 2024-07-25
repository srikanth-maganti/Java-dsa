package greedy;
import java.util.*;

public class chocola {
    public static void main(String args[])
    {     int m=6;
        int n=4;
        Integer costver[]={2,1,3,1,4};
        Integer costhor[]={4,1,2};
        Arrays.sort(costver,Comparator.reverseOrder());
        Arrays.sort(costhor,Comparator.reverseOrder());

        int hp=1;
        int vp=1;
        int h=0,v=0;
        int cost=0;
        while(h<costhor.length&& v<costver.length)
        {
            if(costhor[h]>=costver[v])//vertical cut
            {
                cost+=(costhor[h]*vp);
                hp++;
                h++;
            }
            else{
                cost+=(costver[v]*hp);
                vp++;
                v++;
            }
        }
        while (h<costhor.length) {
            cost+=(costhor[h]*vp);
                hp++;
                h++;
            
            
        }
        while(v<costver.length)
        {
            cost+=(costver[v]*hp);
            v++;
            vp++;
        }
        System.out.println(cost);
        

    }
}
