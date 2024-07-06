package recurssion;

public class firstoccurance {
    public static int firstoccur(int arr[],int k,int i )
    {
        if(i==arr.length-1)
        {
            return -1;
        }
        if(arr[i]==k)
        {
            return i;
        }
        return firstoccur(arr,k,i+1);
    }
    public static int lastoccur(int arr[],int k,int i)
    {
        if(i==arr.length)
        {return -1;}
        int isfound=lastoccur(arr, k, i+1);
        if(isfound==-1 && arr[i]==k)
        {
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[]={8,3,4,5,2,5,2};
        System.out.println(firstoccur(arr,5,0));
        System.out.println(lastoccur(arr,5,0));
    }
}
