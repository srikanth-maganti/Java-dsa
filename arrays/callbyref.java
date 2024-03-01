import java.util.*;
class callbyref
{   public static void update(int arr[],int n)
    {   n=n+1;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]+1;

        }
    }
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
        {   System.out.println("enter number into position:"+i);
            arr[i]=sc.nextInt();
        }


        int unchangeable=5;

        update(arr,unchangeable);//arr-call by value,unchangeable-call by reference

        System.out.println(unchangeable);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}