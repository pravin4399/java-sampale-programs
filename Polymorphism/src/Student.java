public class Student {

    String name ;
    int rollNum ;
    int id ;


    public Student(){

    }
    public Student (int id){
        this.id = id;
    }
    public Student(String name){
        this .name =name;
    }
    public Student(String name,int id ,int rollNum){
        this.name =name;
        this.id = id;
        this.rollNum =rollNum;
    }
    public  Student (int id ,String name ,int rollNum){
        this.id =id;
        this.name =name;
        this.rollNum= rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                ", id=" + id +
                '}';
    }
    public void doStudy (){
        System.out.println(" Student is Studying");
    }
    public void doStudy( String subject){
        System.out.println("Student is Studying"+ subject);
    }
    public void commute(){
        System.out.println("student is commuting");

    }
    public void play(){
        System.out.println("student is playing");
    }
     Student studentDetails() {
         return this;
     }

    }



