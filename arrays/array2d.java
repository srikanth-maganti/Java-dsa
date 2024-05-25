import java.util.*;

public class array2d {
    public static void max(int matrix[][])
    {
       int max=Integer.MIN_VALUE;
       for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
               if(max<matrix[i][j]) {
                max=matrix[i][j];
                
               }
            }
        }
        System.out.println("max value is "+ max);

    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(  matrix[i][j]+" ");
              
            }
            System.out.println();
        }

        max(matrix);
        sc.close();

    }
}
