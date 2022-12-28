import java.util.Scanner;

/**
 * problem statement : take user form 1-7 and print day
 * if user provide 1 print monday
 * ...
 * ...
 * if user provided 7 print sunday
 * any other input mark as invalid
 *
 */




public class DryOfWeek {
    public static void main(String[] args) {
        while (true) {
            System.out.println("provide any int input");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input) {

                case 1:
                    System.out.println("monday");
                    break;
                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("thursday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("sunday");
                    break;


            }
            System.out.println("Do you want to try more:(yes/no");
            Scanner SC1 = new Scanner(System.in);
            String yesorno = SC1.next();
            if (yesorno.equalsIgnoreCase("no")) {//this String -- yes or and specified object -- "no"
                break;
            } else if (yesorno.equalsIgnoreCase("yes")) {
                continue;// to continue loop and skip all ststement below it .

            }

        }
    }
}