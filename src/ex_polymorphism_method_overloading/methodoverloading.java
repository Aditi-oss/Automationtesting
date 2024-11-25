package ex_polymorphism_method_overloading;

public class methodoverloading {
    public static void main(String[] args) {
       mathoperation m2=new mathoperation();
        System.out.println("result");
        //same name but diffrent parameters
        //method overloading
        //compile time we know to run
    }
}
class  mathoperation
{
    int add (int a,int b){
        return a+b;

    }
    float add(int a,int b,int c){
        return a+b+c;
    }


}