package dynamic_programming;

public class mountainranges {
    public static int ranges(int n)
    {
        int dp[]=new int[n+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            //i no pairs -> no of mountain ranges
            for(int j=0;j<i;j++)
            {
                int inside=dp[j];
                int outside=dp[i-j-1];
                dp[i]+=inside*outside;
            }
        }
        return dp[n];
    }
    public static void main(String args[])
    {
        int n=4;
        System.out.println(ranges(n));
    }
}
