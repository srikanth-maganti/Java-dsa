class fun_overload
{
    public static void main(String args[])
    {  System.out.println(sum(1,2)); 
        System.out.println(sum(1,2,3));

        System.out.println(multiply(2,3));
        System.out.println(multiply(3.2f,4.5f));

    }

    //no of parameters
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;

    }


    //type of paramters
    public static int multiply(int a,int b)
    {
        return a*b;
    }
    public static float multiply(float a,float b)
    {
        return a*b;
    }


}