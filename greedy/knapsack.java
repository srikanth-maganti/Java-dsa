package greedy;
import java.util.*;
import java.util.Comparator;

public class knapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        double ratio[][]= new double[val.length][2];
        for(int i=0;i<val.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        int capacity=w;
        int result=0;
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        for(int i=ratio.length-1;i>=0;i--)
        {
            int curridx=(int)(ratio[i][0]);
            if(capacity>=weight[curridx])
            {
                capacity=capacity-weight[curridx];
                result=result+val[curridx];
            }
            else{
                //include fractional part
                result=result+(int)(capacity*ratio[i][1]);
                break;
            }


        }
        System.out.println(result);
         
    }
}
