import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class inbuilt {
        public static void main(String args[])
        {
            int a[]=new int[5];
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
            
        }
}
