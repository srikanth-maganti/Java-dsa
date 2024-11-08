public class knapsack{
    public static int knapsack1(int val[],int wt[],int w,int n,int dp[][])
    {
        if(w==0 || n==0)
        {
            return 0;
        }

        if(dp[n][w]!=-1)
        {
            return dp[n][w];
        }
        if(wt[n-1]<=w)
        {
            dp[n][w]= Math.max(val[n-1]+knapsack1(val,wt,w-wt[n-1],n-1,dp), knapsack1(val,wt,w,n-1,dp));
            return dp[n][w];
        }
        else
        {
            dp[n][w]= knapsack1(val,wt,w,n-1,dp);
            return dp[n][w];
        }
    }
    public static void print(int dp[][])
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                System.out.print(dp[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static int knapsacktab(int val[],int wt[],int W)
    {   int n=val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=0;//0th column
        }
        for(int i=0;i<W+1;i++)
        {
            dp[0][i]=0;//0th row
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                int v=val[i-1];
                int w=wt[i-1];
                if(w<=j)
                {
                    dp[i][j]=Math.max(v+dp[i-1][j-w],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][W];
    }
    public static void main(String args[])
    {
        int wt[]={2,5,1,3,4};
        int val[]={15,14,10,45,30};
        int w=7;
        int n=val.length;
        int dp[][]=new int[n+1][w+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(knapsack1(val,wt,w,val.length,dp));
        System.out.println(knapsacktab(val, wt, w));
    }
}