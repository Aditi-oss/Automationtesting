package ex_InheritanceExample.example2.Example2;

public class Python extends Programming{
    //extends is a relationships
    //python is programming language
    void print(){
        System.out.println(author);
    }
    Python()
    {
        System.out.println("dc");
    }
    public static void main(String[]args)
    {
        Python p1=new Python();
        System.out.println(p1.author);
    }
}
