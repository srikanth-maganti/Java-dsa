class countingsort
{   public static void sort(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(arr[i],max);
        }
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                count[i]--;
                j++;
            }
        }
    }
    public static void main(String args[])
    {
         int arr[]={1,4,1,2,3,4,5,7};
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}