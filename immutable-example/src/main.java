public class main {

    public static void main(String[] args) {
     Employee employee = new Employee("pravin",101,1000,
             new Address("A-106",null,null,"pune",412201));

        System.out.println(employee);
        employee.getAddress().setCity("Mumbai");
        System.out.println(employee);
        System.out.println(employee);

         }
    }

