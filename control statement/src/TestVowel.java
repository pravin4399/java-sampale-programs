import java.util.Scanner;
/**
 * this program demonstrate  switch case example
 * @author Pravin Tupe
 *
   */


public class TestVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a character :");
        String str = scanner.next();//str ="Pravin"
        char[] charArr = str.toCharArray();
        int x = 0;

        while (x <= 10) {
            if (charArr.length == 1) {
                switch (charArr[0]) {
                    case 'a' -> System.out.println("vowel");
                    case 'e' -> System.out.println("vowel");
                    case 'i' -> System.out.println("vowel");
                    case 'o' -> System.out.println("vowel");
                    case 'u' -> System.out.println("vowel");
                }
            } else {
                System.out.println("user entered string instead of char  ");
            }
            x++;

        }
    }
}
