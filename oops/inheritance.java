package oops;

public class inheritance
{
    public static void main(String[] args) {
        dog d1=new dog();
        d1.legs=4;
        d1.eat();
        d1.sleep();
        d1.breed();
        
    }
}

class Animal
{
    void eat()
    {
        System.out.println("eating");
    }
    void sleep()
    {
        System.out.println("sleeping");
    }
}
class Mammal extends Animal
{   int legs;
    void walk()
    {
        System.out.println("walks");
    }
}
class dog extends Mammal{
    void breed()
    {
        System.out.println("german shepherd");
    }
}

class Fish extends Animal{
    void swim()
    {
        System.out.println("swimming");

    }
}

class bird extends Animal{
    void fly()
    {
        System.out.println("flying");
    }
}