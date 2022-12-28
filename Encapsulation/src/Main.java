public class Main {



   public static void main(String[] args) {

      Address address = Address.getInstance();
      address .setFlatNumber("A-103");
      address.setSociety("visita vintage");
      address.setPinCode(412201);



      Employee employee = Employee.getInstance();
         employee .setName("Ram");
         employee .setSalary(9000);
         employee.setAge(21);
         employee.setAddress(address);
         System.out.println(employee);


       Address address1 = Address.getInstance();
       address1.setFlatNumber("A - 101");
       address1.setSociety("Sai park");
       address1.setPinCode(412208);


      Employee employee1 = Employee.getInstance();
         employee1.setName("Mike");
         employee1.setSalary(8000);
         employee1.setAge(10);
         employee1.setAddress(address1);
      System.out.println(employee1);                             
   }
   }


