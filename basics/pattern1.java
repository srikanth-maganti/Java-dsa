import java.util.*;
public class pattern1
{   void palindromicpattern(int n)
    {
         int i=0,j=0,k=0;
        for(i=1;i<=n;i++)
        {
            for(j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
         int n=sc.nextInt();

        pattern1 obj=new pattern1();
        obj.palindromicpattern(n);
       
        int i=0,j=0,k=0;
        for(i=1;i<=n;i++)
        {
            for(j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(j=0;j<i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("\n");
        }
    }
}