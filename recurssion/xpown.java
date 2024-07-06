package recurssion;

public class xpown {
    public static int optimizedpow(int x,int n)
    {
        if(n==1)
        {
            return x;

        }
        int halfpow=optimizedpow(x, n/2);
        int halfpowsq=halfpow*halfpow;
        if(n%2==1)
        {
            halfpowsq*=x;
        }
        return halfpowsq;
    }
    public static int pow(int x,int n)
    {
        if(n==1)
        {
            return x;

        }
        return x*pow(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(pow(2,3));
        System.out.println(optimizedpow(2,3));
    }
}
