package StringExample1;

public class StringMethods {
    public static void main(String[] args) {
        String name1 = "Cat";
        String name2 = name1.toUpperCase();
        System.out.println(name2);
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(3));


    }
}
