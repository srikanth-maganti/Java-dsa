import java.util.Scanner;
public class callbyvalue
{   public static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();

        swap(a,b);
        System.out.println("a:"+a+"b:"+b);
    }
}