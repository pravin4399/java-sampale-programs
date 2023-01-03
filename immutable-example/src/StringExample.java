public class StringExample {

    public static void main(String[] args) {


        String name1 = "Mike";
        String name2 = "mike";
        String name3 = "pravin";
        String name4 = name3.intern();
        String name =new String("mike");


        if (name2 == name1){
            System.out.println("name2 and name3 are pointing to same string objets");
        } else {
            System.out.println(" They are holding different addresses");
    }
}
}