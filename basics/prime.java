public class prime{
    public static void main(String args[])
    {
        for(int i=1;i<=10;i++)
        {
            if(isprime(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean isprime(int n)
    {   if(n<2)
        {
            return false;
        }
        if(n==2){
        return true;
        }
        /*
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;*/

        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }


}