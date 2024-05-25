import java.util.Arrays;
import java.util.Collections;
class insertion
{   public static void sort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j--;

            }
            a[j+1]=temp ;
        }
    }
    public static void main(String args[])
    {
         int arr[]={1,4,53,2,44,2};
         Integer ar[]={1,4,53,2,44,2};
        //sort(arr);




         // Arrays.sort(arr);
         //Arrays.sort(arr,0,4);

         //Arrays.sort(ar,Collections.reverseOrder());
         Arrays.sort(ar,0,4,Collections.reverseOrder());

    


        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}