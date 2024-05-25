public class searchinmatrix {
    public static void main(String[] args) {
        int key=33;
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,45},{32,33,39,50}};
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==key)
            {
                System.out.println("founded");
                return;
            }
            else if(key<matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;

            }
        }
        System.out.println("not founded");

    }

}
