public class spiral {
    public static void printspiral(int matrix[][])
    {
        int sr=0;
        int sc=0;
        int ec=matrix[0].length-1;
        int er=matrix.length-1;
        while(sr<=er && sc<=ec)
        {
            for(int i=sc;i<=ec;i++)
            {
                System.out.print(matrix[sr][i] +" ");
            } 
            for(int i=sr+1;i<=er;i++)
            {
                System.out.print(matrix[i][ec]+" ");
            }
            for(int i=ec-1;i>=sc;i--)
            {   if(sr==er)
                {
                    return;
                }
                System.out.print(matrix[er][i]+" ");
            }
            for(int i=er-1;i>=sr+1;i--)
            {   if(ec==sc)
                {
                    return;
                }
                System.out.print(matrix[i][sc]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }

    }
    public   static void main(String args[])
    {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}};
        printspiral(matrix);
    }
}
