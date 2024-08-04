public class floodfill {

    public static void floodfill(int image[][],int sr,int sc,int color)
    {
        boolean vis[][]=new boolean[image.length][image[0].length];

        helper(image,sr,sc,color,vis,image[sr][sc]);
        return;
    }

    public static void helper(int image[][],int sr,int sc,int color,boolean vis[][],int orgcol)
    {   if(sr<0 || sr>image.length-1 || sc<0 || sc> image[0].length-1 || vis[sr][sc] || image[sr][sc]!=orgcol)
        {
            return ;
        }
        vis[sr][sc]=true;
        image[sr][sc]=color;
        //left
        helper(image,sr,sc-1,color,vis,orgcol);
        helper(image,sr,sc+1,color,vis,orgcol);
        helper(image,sr-1,sc,color,vis,orgcol);
        helper(image,sr+1,sc,color,vis,orgcol);
        
    }
    public static void main(String args[])
    {
        int image[][]={{1,1,1},{1,1,0},{1,0,1}};
        int sr=1;
        int sc=1;
        int color=2;

        floodfill(image,sr,sc,color);

        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[i].length;j++)
            {
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
}
