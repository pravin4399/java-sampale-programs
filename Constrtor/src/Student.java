public class Student {
        private String name ;
        private int id ;

        public Student(){
            this.name = "omkar";
            this.id = 100;

        }
        public Student(String name , int id){
            this.name = name;
            this.id = id;
        }
          public Student(Student s){
            this.name = s.name;
            this.id = s.id;


          }
          public void  displayFileds(){
              System.out.println("\nthe name of Student is :" + this.name);
              System.out.println("the id of the Student is : "+ this.id);

          }

    }













