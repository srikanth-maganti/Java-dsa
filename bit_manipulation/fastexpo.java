package bit_manipulation;

public class fastexpo {
    public static void main(String[] args) {
        int a=5,n=3;
        int ans=1;
        while(n>0)
        {
            if((n&1)!=0)
            {
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }
}
