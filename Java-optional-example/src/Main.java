import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        final String name = "Pravin";

        if (name != null && !name.isEmpty() && !(name.length() > 3)) {
            System.out.println(" Length of String in greater than  3 ");
        } else {
            System.out.println("String of either null or Empty or less than 3 ");
        }

      //Optional<String> name2 =Optional.ofNullable(name);
        Optional<String> name2 =Optional.empty();


         if ( !name.isEmpty() && name2.get().length() > 3){
             System.out.println("Length of String is greater than than 3");
         } else {
             System.out.println("String is either null or empty or less than 3 ");
         }
    }

}


