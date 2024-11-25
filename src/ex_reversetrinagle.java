import java.util.Scanner;

public class ex_reversetrinagle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("enter the number rows ");
        for (int i =rows; i >= 1; i--) ;
        {
            //for (int j = 0; j<=i; j++) ;
            {
                System.out.print("*");

            }
            System.out.println(" ");
        }

    }
}
