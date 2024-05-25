class selection
{   public static void sort(int a[])
    {   int n=a.length;
        
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[min]>a[j])
                {
                    min=j;
                 }
             }
             if(min!=i)
             {
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;
             }
    }
    }
 public static void main(String args[])
    {
        int arr[]={1,4,53,2,44,2};
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}