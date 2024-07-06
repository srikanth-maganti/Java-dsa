package recurssion;

public class tiling {
    public static int tilingways(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        //choice
        //vertical choice
        int vc=tilingways(n-1);
        //horizontal choice
        int hc=tilingways(n-2);

        return vc+hc;
    }
    public static void main(String[] args) {
        System.out.println(tilingways(3));
    }
    
}
