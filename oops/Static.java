package oops;

public class Static {
    public static void main(String[] args) {

        Student s1=new Student();
        s1.clg="rgukt";
        Student s2=new Student();
        System.out.println(s2.clg); 
        
    }
    
}

class Student
{
    String name;
    static String clg;
    static int sum(int a,int b)
    {
        return a+b;
    }
    String getname()
    {
        return this.name;
    }

    void setname(String name)
    {
        this.name=name;
    }
}
