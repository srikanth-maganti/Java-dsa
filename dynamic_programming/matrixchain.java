import java.util.*;
public class matrixchain
{   public static int mcm(int arr[],int i,int j)
    {
        if(i==j)
        {
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            int cost1=mcm(arr,i,k);
            int cost2=mcm(arr,k+1,j);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int cost=cost1+cost2+cost3;
            ans=Math.min(ans,cost);
        }
        return ans;
    }

    public static int mcmmem(int arr[],int i,int j,int dp[][])
    {
        if(i==j)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++)
        {
            int cost1=mcm(arr,i,k);
            int cost2=mcm(arr,k+1,j);
            int cost3=arr[i-1]*arr[k]*arr[j];
            ans=Math.min(ans,cost1+cost3+cost2);
        }
        return dp[i][j]=ans;
    }
    public static int mcmtab(int arr[])
    {
        int n=arr.length;
        int dp[][]=new int[n][n];
        //initialization
        for(int i=0;i<n;i++)
        {
            dp[i][i]=0;
        }

        //bottom up filling
        for(int len=2;len<n;len++)
        {
            for(int i=1;i<=n-len;i++)
            {
                int j=i+len-1;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<=j-1;k++)
                {
                    int cost1=dp[i][k];
                    int cost2=dp[k+1][j];
                    int cost3=arr[i-1]*arr[k]*arr[j];

                    dp[i][j]=Math.min(dp[i][j],cost1+cost2+cost3);
                }
            }
        }
        print(dp);
        return dp[1][n-1];
    }
    public static void print(int dp[][])
    {   int n=dp.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,3};
        int n=arr.length;
        System.out.println(mcm(arr,1,n-1));
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        
        System.out.println(mcmmem(arr,1,n-1,dp));
        System.out.println(mcmtab(arr));
    }
}