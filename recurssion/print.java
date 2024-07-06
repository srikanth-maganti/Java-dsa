package recurssion;

public class print {
    public static void printkaro(int n)
    {
        if(n!=0)
        {
            System.out.println(n);
            printkaro(--n);
        }
    }
    public static void printinc(int n)

    {   if(n==1)
        {
            System.out.println(1);
            return;
        }
        printinc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printkaro(5);
        printinc(5);
    }
    
}
