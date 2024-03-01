import java.util.*;
class linearsearch
{   public static int find(int arr[],int a)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==a)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={33,23,45,2,667,89};
        int pos=find(arr,2);
        if(pos==-1)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println(pos);
        }
    }
}