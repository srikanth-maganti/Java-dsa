package recurssion;

public class friendspair {
    public static int noofways(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }
        int single=noofways(n-1);
        int pair=noofways(n-2)*(n-1);
        return single+pair;
    }
    public static void main(String[] args) {
        System.out.println(noofways(3));
    }
    
}
