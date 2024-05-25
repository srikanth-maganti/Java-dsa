class bubblesort
{   public static void bubble(int arr[])
    {   int t=0;
        for(int i=0;i<arr.length-1;i++)
        {   t=0;
            for(int j=0;j<arr.length-i-1;j++)
            {   
                if(arr[j]>arr[j+1])
                {   t=1;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(t==0)
            {
                break;
            }
            
        }
    }

    public static void main(String args[])
    {
        int arr[]={1,4,53,2,44,2};
        bubble(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}