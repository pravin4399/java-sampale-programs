public class EmployeeDriver {

    public static void main(String[] args) {

        Employee Pravin = new Employee();//obj1
        Employee suraj = new Employee();//obj2

        Pravin.Name = "Pravin";
        suraj .Name = "suraj";
        Pravin.id= 100;
        suraj .id =200;
        Pravin.Department ="Rnd";
        suraj.Department ="sales";
        Pravin.designation="SSE";
        suraj.designation="CM";


        suraj.employeeDoingmeeting();
        suraj.doAttedMettings();
        Pravin.doAttedMettings();

    }
}
