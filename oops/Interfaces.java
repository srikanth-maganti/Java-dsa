package oops;

public class Interfaces {
    public static void main(String[] args) {
        bear b1=new bear();
        b1.veg();
        b1.nonveg();

        queen q=new queen();
        q.moves();
    }
    
}

//multiple inheritance
interface carnivore
{
    void nonveg();
}

interface herbivore
{
    void veg();
}

class bear implements carnivore,herbivore
{
    public void nonveg()
    {
        System.out.println("eat non veg");
    }
    public void veg()
    {System.out.println("eat veg");
    }
}


//total abstraction
interface chess{
    void moves();
}

class queen implements chess{
    public void moves()
    {
        System.out.println("left ,right ,top,bottom,diagonal");
    }
}

