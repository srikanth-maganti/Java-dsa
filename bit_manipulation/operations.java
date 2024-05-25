package bit_manipulation;

public class operations {
    public static int getithbit(int n,int i)
    {
        int bitmask=1<<i;
        if((n&bitmask)==0)
        {
            return 0;
        }
        else{return 1;}

    }

    public static int setithbit(int n,int i)
    {
            int bitmask=1<<i;
            return n|bitmask;
    }

    public static int clearithbit(int n,int i)
    {
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int updateithbit(int n,int i,int newbit)
    {
        int num=clearithbit(n, i);
        int bitmask=newbit<<i;
        return num|bitmask;
    }
    public static int clearibits(int n,int i)
    {
        int bitmask=(-1)<<i;
        return n&bitmask;
    }

    public static int clearbitsinrange(int n,int i,int j)
    {
        int a=(-1)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }

    public static void main(String[] args) {
        
        System.out.println(getithbit(5, 2));
        System.out.println(setithbit(5,1));
        System.out.println(clearithbit(5,0));
        System.out.println(updateithbit(5,0,0));
        System.out.println(clearbitsinrange(10, 2, 4));
    }
}
