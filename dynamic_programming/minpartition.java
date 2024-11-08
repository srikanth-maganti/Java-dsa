public class minpartition
{
    public static int minimumdiff(int arr[])
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int W=sum/2;

        int dp[][]=new int[n+1][W+1];
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<=W;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]=Math.max(dp[i-1][j-arr[i-1]]+arr[i-1],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        int sum1=dp[n][W];
        int sum2=sum-sum1;
        return Math.abs(sum1-sum2);
    }


    public static boolean iszerodiff(int arr[])
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }

        int W=sum/2;

        int dp[][]=new int[1+n][1+W];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=W;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]=Math.max(dp[i-1][j-arr[i-1]]+arr[i-1],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            
            }
        }
        return Math.ceil((double)sum/2)==dp[n][W];
    }
    public static void main(String args[])
    {
        int arr[]={1,6,11,5};
        int arr2[]={1,2,3};
        System.out.println(minimumdiff(arr));
        System.out.println(iszerodiff(arr2));
    }
}