package oops;
//using abstract keyword
public class Abstraction {
    public static void main(String[] args) {
        Deer d1=new Deer();
        d1.walk();
        System.out.println(d1.skincolor);
        d1.eat();


        peacock p1=new peacock();
        p1.skincolor="greeen";
        p1.walk();
        p1.eat();
        System.out.println(p1.skincolor);
        
    }
}
abstract class Animal{
    String skincolor;
    Animal()
    {
        this.skincolor="brown";
    }
    void eat()
    {
        System.out.println("eating");
    }
    abstract void walk();
}   

class Deer extends Animal
{
    Deer()
    {
        skincolor="gold";
    }

    void walk()
    {
        System.out.println("walks with four legs");
    }
}

class peacock extends Animal{

    void walk()
    {
        System.out.println("walks with two legs");
    }
}

