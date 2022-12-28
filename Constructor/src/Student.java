public class Student {
    private String name;
    private int id;
    private String collageName;


    //  fields getters

    public String getName (){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getCollageName(){
        return collageName;

     // fields setters

    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id ;
    }
    public void setCollageName(String collageName){
        this.collageName = collageName;
    }

    // no-arg constructor

    public  Student(){
        name ="Mike";
        id = 101;
        collageName = "Standford";

    }
    //parametrized
    // different number of argument
    // basically this holds to the address for the obj that calls the constructors
    //this is the reference for current obj

    public Student (String name,int id,String collageName){
        this .name = name;
        this .id = id;
        this.collageName = collageName;


    }
    // parametrized constructor with different sequence of parameters


    public Student (int id,String name,String collageName){
        this.name = name ;
        this.id = id ;
        this .collageName = collageName ;
    }
    private Student( int id ,String collageName){
        this.id = id;
        this.collageName = collageName;

    }
    //type different example for constructor overloding
    public Student(String name){
        this(1000, "COEP");
        this.name = name;
    }
     public  Student(int id){
        this .id = id;
     }


    //copy constructor
    // fields must be primitive or immutable
    // name and collageName are immutable because of String class
    // id is primitive 

    public Student (Student student){
        this.name = student.name;
        this.id = student.id;
        this.collageName = student.collageName;
    }

    @Override
    public String toString(){
        return "name : "+ name + " id : "+ id +" collage name " + collageName;

    }


}
