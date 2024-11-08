public class subsetsum
{   public static void print(boolean dp[][])
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean targetsubsetsum(int nums[],int targetsum)
    {   int n=nums.length;
        boolean dp[][]=new boolean[n+1][targetsum+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=true;
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<targetsum+1;j++)
            {
                //include
                int v=nums[i-1];
                if(v<=j && dp[i-1][j-v]==true)
                {
                    dp[i][j]=true;
                }
                else if(dp[i-1][j]==true)
                {
                    dp[i][j]=true;
                }
            }
        }

        print(dp);
        return dp[n][targetsum];
    }
    public static void main(String args[])
    {
        int nums[]={4,2,7,1,3};
        int targetsum=10;

        System.out.println(targetsubsetsum(nums,targetsum));

    }
}