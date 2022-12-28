public class CalDriver {
    public static void main(String[] args) {
        Calculator mycal = new Calculator();
        mycal.num1=1000;
        mycal.num2=200;

        int res =mycal.add();
        System.out.println(res);
        int sub= mycal.sub();
        System.out.println(sub);
         int mul = mycal.mul();
        System.out.println(mul);
        int div= mycal.division();
        System.out.println(div);
       int modivision = mycal.modDivision();
        System.out.println(modivision);
        Calculator.name="calculator";
        Calculator.display();

    }

    }





