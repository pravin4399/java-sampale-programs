import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        while (true) {
            System.out.println("provided any input ");
            Scanner Sc = new Scanner(System.in);
            int input = Sc.nextInt();
            switch (input){

                case 1 :
                    System.out.println("monday");
                    break;

                case 2 :
                    System.out.println("Tuesday");
                    break;

                case 3 :
                    System.out.println("wednesday");
                    break;

                case 4 :
                    System.out.println("thursday");
                    break;

                case 5 :
                    System.out.println("friday");
                    break;

                case 6 :
                    System.out.println("saturday");
                    break;

                case 7 :
                    System.out.println("sunday");
                    break;
                default:
                    System.out.println("provided invalid input ");

            }
            System.out.println("Do you want to try more ");
            Scanner sc1 = new Scanner(System.in);
            String YesOrNo = sc1.next();
            //* this string --yesOrNo and specified object --"No"
            if (YesOrNo.equalsIgnoreCase("No"))
            break;
            else if (YesOrNo.equalsIgnoreCase("Yes")) {
                continue;
            }
        }
        }
    }

