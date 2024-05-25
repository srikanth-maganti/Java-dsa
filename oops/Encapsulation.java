package oops;
//encapsulation and constructors
public class Encapsulation
{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setcolor("yeloow");
        System.out.println(p1.color);
        Bankacount b1=new Bankacount();
        b1.username="srikanth";
        b1.setpassword("abc");


        Student s1=new Student();
        s1.name="srikanth";
        s1.x=5;
        s1.marks[0]=90;
        s1.marks[1]=100;
        s1.marks[2]=80;


        Student s2=new Student(s1);
        for(int x:s2.marks)
        {
            System.out.println(x);
        }
        System.out.println(s2.x);


        s1.x=3;
        s1.marks[2]=90;


        for(int x:s2.marks)
        {
            System.out.println(x);
        }
        System.out.println(s2.x);

        
        
    }
}


//access specifier
class Bankacount{
    public String username;
    private String password;

    public void setpassword(String str)
    {
        password=str;
    }
}


//getter and setter
class Pen{
    String color;
    int tip;
    String getcolor()
    {
        return this.color;
    }

    int gettip()
    {
        return this.tip;
    }

    void setcolor(String color)
    {
        this.color=color;
    }

    void settip(int tip)
    {
        this.tip=tip;
    }
}



//shallow copy and deep copy
class Student
{
    String name;
    int x;
    int marks[]=new int[3];
    Student()
    {
        System.out.println("constructor called");
     }

     //shallow copy
    // Student(Student s)
    // {
    //     this.x=s.x;
    //     this.marks=s.marks;
    //     this.name=s.name;
    // }

    //deepcopy
    Student (Student s)
    {   this.name=name;
        this.x=s.x;
        for(int i=0;i<this.marks.length;i++)
        {
            this.marks[i]=s.marks[i];
        }
    }
}