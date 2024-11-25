package ex_polymorphism_method_overloading.overridingex;

public class lab002ex {
    public static  void main(String []args)
    {
        Father f2= new Father();
        f2.home();
        child f1=new child();
        f1.home();
        //same method name with same parameter//overriding
        //same method name with diff Parameter 

    }
}
class Father
{
    void home ()
    {
        System.out.println("2bhk");
    }
    void f2()
    {

    }
}
class child extends Father{
    @Override
    void home ()
    {
        System.out.println("3bhk");
    }
    void f1()
    {

    }
}
