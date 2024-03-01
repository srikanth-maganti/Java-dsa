class subarray
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int cnt=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(a[k]+",");
                }
                System.out.print(" ");
                cnt++;
            }

            System.out.println();

        }
        System.out.println("no of subarrays:"+cnt);
        System.out.println("max sum is "+prefix(a));
    }
    //using prefux sum
    public static int prefix(int a[])
    {   int prefix[]=new int[a.length];
        int max=Integer.MIN_VALUE;
        prefix[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            prefix[i]=prefix[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                int curr= (i==0 )? prefix[j] : prefix[j]-prefix[i-1];
                if(max<curr)
                {
                    max=curr;
                }
            }
        }
        return max;
    }



    //brute force method
    public static int maxsum(int a[])
    {   int max=Integer.MIN_VALUE;
    int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {   sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+a[k];
                    
                }
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        return max;
    }
    
}