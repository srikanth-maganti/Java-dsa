package backtracking;
public class array {
    public static void modifyarr(int arr[],int i,int val)
    {   if(i==arr.length)
        {
            printarr(arr);
            return;
        }
        arr[i]=val;
        modifyarr(arr,i+1,val+1);
        arr[i]-=2;
    }
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[]=new int[5];
        modifyarr(arr,0,1);
        printarr(arr);
    }
}
