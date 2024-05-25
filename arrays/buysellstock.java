class buysellstock
{   public static int maxprofit(int a[])
    {
        int max=0;
        int buyprice=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(buyprice<a[i])
            {
                int profit=a[i]-buyprice;
                max=Math.max(profit,max);
            }
            else
            {
                buyprice=a[i];
            }
        }
        return max;

    }
    public static void main(String args[])
    {
        int a[]={7,1,5,3,6,4};
        System.out.println(maxprofit(a)) ;
    }
}