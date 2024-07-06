import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class inbuilt {
        public static void main(String args[])
        {
            Integer a[]=new Integer[5];
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a,Collections.reverseOrder());
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
            
        }
}
