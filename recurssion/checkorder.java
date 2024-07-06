package recurssion;

public class checkorder {
    public static boolean check(int arr[],int i)
    {   if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return check(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,5};
        System.out.println(check(arr,0));
    }
    
}
