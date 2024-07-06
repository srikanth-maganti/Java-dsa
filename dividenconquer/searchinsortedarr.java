package dividenconquer;

public class searchinsortedarr {
    public static int search(int arr[],int si,int ei,int tar)
    {   if(si>ei)
        {return -1;}
        int mid=(si+ei)/2;
        if(arr[mid]==tar)
        {
            return mid;

        }

        //l1 line
        if(arr[si]<=arr[mid])
        {   //case1
            if(arr[si]<=tar&& tar<=arr[mid])
            {
                return search(arr,si,mid-1,tar);
            }
            else
            {
            return search(arr,mid+1,ei,tar);
            }

        }

        //l2 line
        else{

            if(arr[mid]<=tar && tar<=arr[ei])
            {
                return search(arr,mid+1,ei,tar);
            }
            else{
                return search(arr,si,mid-1,tar);

           }
        }

        
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int idx=search(arr,0,arr.length-1,44);
        System.out.println(idx);
    }
}
