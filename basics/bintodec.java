public class bintodec
{
    public static void main(String args[])
    {
        int bin=101;
        int dec=converttodec(bin);
        System.out.println(dec);

        System.out.println(converttobin(dec));
    }

    public static int converttobin(int n)
    {   int i=0;
        int r=0,s=0;
        while(n>0)
        {   r=n%2;
            s=s+ r*(int)(Math.pow(10,i));
            i++;
            n=n/2;
        }
        return s;
    }
    public static int converttodec(int n)
    {   int r=0;
        int i=0,s=0;
        while(n>0)
        {
            r=n%10;
            s=s+r*(int)(Math.pow(2,i));
            i++;
            n=n/10;

        }
        return s;
    }
}