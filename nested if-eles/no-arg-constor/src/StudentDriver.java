public class StudentDriver {

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println("s1.name");
        System.out.println("s1.id");
        System.out.println("s1.section");


        Student s2 = new Student( "pravin", 200, 'd');
        System.out.println("name: "+s1.name+ "\nid: " +s1.id+ "\nsection: "+s1.section);
    }

}




