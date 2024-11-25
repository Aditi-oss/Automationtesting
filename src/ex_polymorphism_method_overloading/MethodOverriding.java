package ex_polymorphism_method_overloading;

public class MethodOverriding {
public static  void main(String []args)
{
    hound h1=new hound();
    h1.bark();
}
        //method overriding
        //same name as my parent is override is must
    }
class dog{
    void bark(){
        System.out.println("i am dog i can bark");
    }
int age =10;

}
class hound extends dog{
    //hound is an dog types
    @Override
    void  bark()
    {
        System.out.println("bark of hound ");
    }
}