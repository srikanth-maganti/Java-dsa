import java.util.*;

public class binomcoff{

    public static int factorial(int n)
    {
        int i=0,fact=1;
        for(i=n;i>0;i--)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static int coff(int n,int r)
    {
        int fact1=factorial(n);
        int fact2=factorial(n-r);
        int fact3=factorial(r);

        return fact1/(fact2*fact3);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        System.out.println("enter r:");
        int r=sc.nextInt();

        int bc=coff(n,r);
        System.out.println(bc);
    }
}