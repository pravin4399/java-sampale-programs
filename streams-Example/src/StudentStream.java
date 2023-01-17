import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Student{
    String firstname;

    int rollNumber;

    char division;

    public Student(String firstname, int rollNumber, char division) {
        this.firstname = firstname;
        this.rollNumber = rollNumber;
        this.division = division;
    }
}

public class StudentStream {

    public static void main(String[] args) {
        List<Student> studentlist=new ArrayList<>();

        studentlist.add(new Student("Pravin",15,'A'));
        studentlist.add(new Student("Kiran",1,'B'));
        studentlist.add(new Student("Anjali",11,'C'));
        studentlist.add(new Student("Rutuja",13,'D'));

        Stream<Student> studentStream = studentlist.stream();
        Stream<Student> studentStream1 = studentStream.filter(student -> {
            return student.rollNumber > 10;
        });

        studentStream1.forEach(student -> System.out.println(" firstname : " + student.firstname +
                "  rollNumber : " + student. rollNumber ));

        Stream<Student> studentStreamNew = studentlist.stream();
        long numberElements = studentStreamNew.count();
        System.out.println(numberElements);

    }
}
