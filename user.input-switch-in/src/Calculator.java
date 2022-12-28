public class Calculator {
    /*
 num1:int
 num2:int
 addition():
 subs():int
 Mul():int
 div():int
 */
    int num1;
    int num2;

    public static String name="calculator" ;


    int add(){
        int result =num1+num2;
        return result;}
    int sub(){
        int result =num1-num2;
        return result;
    }
    int mul(){
        int result =num1*num2;
        return result;
    }
    int division(){
        int result =num1/num2;
        return result;

    }
    int modDivision (){
        int result =num1%num2;
        return result;
    }
    static void display() {
        System.out.println("Hello form static method "+name);
    }


}


















