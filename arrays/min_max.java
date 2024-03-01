import java.util.*;
class min_max{
    public static void main(String args[])
    {
        int a[]={1,4,63,33,5,2};

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(min>=a[i])
            {
                min=a[i];
            }
            if(max<=a[i])
            {
                max=a[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}