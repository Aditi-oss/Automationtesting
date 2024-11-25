public class ex_foreachloop002 {
    //for each loops in use in array
    //enhanced loop in array
    public static void main(String[]args)
    {
        int a[]=new int[3];
        a[0]=90;
        a[1]=97;
        a[2]=95;
       // for(int i=0;i<a.length;i++)
        {
            for(int i:a)
            {
                System.out.println(a);
            }
        }
String[]names={"pramod","amit",};
        for(String name:names);
        System.out.println(names);

    }
}
