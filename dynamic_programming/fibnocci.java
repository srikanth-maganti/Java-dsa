public class fibnocci
{   public static int fib(int n,int f[])
    {
        if(n==0|| n==1)
        {
            return n;
        }
        if(f[n]!=0)
        {
            return f[n];
        }
        f[n]=fib(n-1,f)+fib(n-2,f);
        return f[n];
    }

    public static int fibtabulation(int n)
    {
        int dp[]=new int[n+1];
        dp[1]=1;
        for(int i=2;i<dp.length;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];

        }
        return dp[n];
    }
    public static void main(String args[])
    {   int n=5;
        int f[]=new int[n+1];
        System.out.println(fib(5,f));
        System.out.println(fibtabulation(5));
    }
}