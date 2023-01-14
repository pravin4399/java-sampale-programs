import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Java Generics:
 * 1. Generics were introduced in JDK 5.0 to provide Compile-Time Type Checking(Explicit cast)
 * and to eliminate the risk of ClassCastException that was common when working with collection classes earlier.
 * A programmer can restrict a collection class to contain only one type of object using Generics.
 *
 * All occurrences of the formal type parameter e.g. List<E> (E in this case) are replaced
 * by the actual type argument List<Integer> (Integer in this case).
 *
 * Why do we use Generics in Java?
 * Generics provide strong compile-time type checking and reduce the risk of ClassCastException
 * and explicit casting of objects.
 *
 * What is T in Generics?
 * We use <T> to create a generic class, interface, and method.
 * The T is replaced with the actual type parameter when we use it.
 *
 * How does Generics Work in Java?
 * Generic code ensures type safety. The compiler uses type-erasure to remove all type parameters at the compile time to reduce the overload at runtime.
 */


public class Main {
    public static void main(String[] args) {


        //List of Integers
        List<Integer> myInt = new ArrayList<Integer>();

        myInt.add(100);
        myInt.add(200);
        myInt.add(300);

        Integer X = myInt.iterator().next();

        for (Integer integer :
                myInt ) {
            System.out.println(integer);
        }

        //List of Strings
        List<String> myStringList = new ArrayList<>();

        myStringList.add("Pravin");
        myStringList.add("omkar");
        myStringList.add("Raj");

        String name = myStringList.get(1);

        for (String string:
                myStringList  ) {
            System.out.println(string);

        }
        //List of random items
        List sampleList = new LinkedList();
        sampleList.add(100);
        sampleList.add("Pravin");
        sampleList.add(200);

        Integer Y =(Integer) sampleList.get(1); //(Integer) this is explicit casting --> for compile time


    }
}
