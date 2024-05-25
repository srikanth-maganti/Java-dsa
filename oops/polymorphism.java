package oops;

public class polymorphism {
     public static void main(String args[])
     {
        moloading m1=new moloading();
        System.out.println(m1.sum(1,2));
        System.out.println(m1.sum(1,2,3));
        System.out.println(m1.sum(1.3f,2.3f));


        deer d1=new deer();
        d1.eat();
     }
}


//method overloading
class moloading
{
    int sum(int a,int b )
    {
        return a+b;
    }

    float sum(float a,float b)
    {
        return a+b;

    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
}


//method overriding 
class animal
{
    void eat()
    {
        System.out.println("eats everything");
    }
}

class deer extends animal{
    void eat()
    {
        System.out.println("eats grass");
    }
}
