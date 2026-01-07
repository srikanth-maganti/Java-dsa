
import java.util.*;

public class climbingstairs {
    public static int noofways(int n,int ways[])
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(ways[n]!=-1)
        {
            return ways[n];
        }
        ways[n]=noofways(n-1,ways)+noofways(n-2,ways);
        return ways[n];
    }

    public static int tabulation(int n)
    {
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<n+1;i++)
        {
            if(i==1)
            {
                dp[i]=dp[i-1]+0;
            }
            else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int ways[]=new int[6];
        Arrays.fill(ways,-1);
        System.out.println(noofways(5,ways));
        System.out.println(tabulation(5));
    }
}
