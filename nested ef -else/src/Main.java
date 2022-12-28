import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        This Progam denos the Use of nested if -else
        x = 20;
            */
        /*
        Take input Form user ( Form console)
        Read foem user
              */

        System.out.println("enter an integar : ");
        Scanner sc = new Scanner ( System.in );

        int x = sc.nextInt();

        if (x > 20) {
            System.out.println("x > 20");
            if (x > 40) {
                System.out.println("x > 40");
            } else {
                System.out.println("x <= 40");
            }
        }else{
            System.out.println("x <= 20");
        }
    }
}