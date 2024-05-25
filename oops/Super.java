package oops;

public class Super {
    public static void main(String[] args) {
        B b=new B();
        b.display();

        box b1=new box(2,2,2);
        b1.display();
        
    }
}

// varibles

class A{
    String color="green";
    void show()
    {
        System.out.println("parent");
    }

}
class B extends A{
    String color;
    B()
    {
        this.color="yellow";
    }
    void show(){
        System.out.println("child");
    }
    void display()
    {
        System.out.println(this.color);
        System.out.println(super.color);
        super.show();
        this.show();
    }
}

//accesing parent constructor
class shape{
    int width;
    int height;
    shape(int width,int height)
    {
        this.width=width;
        this.height=height;

    }



}

class box extends shape{
    int depth;
    box(int width,int height,int depth)
    {
        super(width,height);
        this.depth=depth;

    }
    void display()
    {
        System.out.println(height+width+depth);
    }

}