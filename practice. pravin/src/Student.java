public class Student {

   private String name ;
   private int id;
   private String collageName;

    // getter

    public String getName() {
        return name ;
    }

    public int getId() {
        return id;
    }

    public String getCollageName() {
        return collageName;
    }


    // setter

    public void setName (  String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }


    // constructors

     public Student (){
         name = "omkar";
         id   = 101;
         collageName = "Standford";

     }
     //  parametrized
     public  Student (String name , int id , String collageName){
         this.name = name ;
         this . id = id ;
         this . collageName = collageName;

     }
     // parametrized constructors with different sequence

    public Student (int  id ,String name , String collageName){
         this . name = name;
         this . id = id;
         this . collageName = collageName;

    }
     private Student(int id , String collageName){
        this.id =id;
        this.collageName =collageName;
     }



    // type of different
    public Student  (String name){
         this(1000 ,"Am");
         this.name = name;


    }
    public  Student (int id ){
         this . id = id ;

    }
    // copy

    public  Student (Student student){
         this.name = student .name;
         this . id = student.id;
         this .collageName = student.collageName;
    }
    @Override
     public String toString(){
        return " name : " + name  + " id : " + id + " collage name " + collageName ;
    }

}
