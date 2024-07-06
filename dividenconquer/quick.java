package dividenconquer;

public class quick {
    public static void quicksort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;

        }
        int pidx=partition(arr,si,ei);
        quicksort(arr,si,pidx-1);
        quicksort(arr,pidx+1,ei);
    }

    public static int partition(int arr[],int si,int ei)
    {
        int i=si-1;
        int pivot=arr[ei];
        for(int j=si;j<=ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
           

        }
        // i++;
        // int temp=arr[ei];
        // arr[ei]=arr[i];
        //  arr[i]=temp;
           
        return i;
    }
    public static void main(String[] args) {
        int arr[]={3,4,2,8,2,1};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
