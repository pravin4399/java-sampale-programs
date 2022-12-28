public class StudentDriver {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("pravin",100);
        Student s3 = new Student(s2);
        s1.displayFileds();
        s2.displayFileds();
        s3.displayFileds();

    }

}
