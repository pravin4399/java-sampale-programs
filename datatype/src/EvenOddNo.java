import java.util.Scanner;

public class EvenOddNo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input x");

        int x= scanner.nextInt();
        System.out.println("x="+x);
        if (x%2==0){
            System.out.println("x is even");

        }else{
            System.out.println("x is odd");
        }

    }
}
