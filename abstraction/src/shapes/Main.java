package shapes;

import features.Shape;

public class Main {
    public static void main(String[] args) {
       Shape circle = new Circle();
        System.out.println( "Area of circle  = "  + circle.calculateArea(10,20));
      Shape triangle =new Triangle();
        System.out.println("Area of Triangle = " + triangle.calculateArea(20,20));
       Shape rectangle = new Rectangle();
        System.out.println("Area of rectangle = "+ rectangle.calculateArea(20,20));
       Shape square= new  Square();
        System.out.println("Area of square = "+ square.calculateArea(10,20));

        circle.displayArea(10,20);
        triangle.displayArea(10,20);
        rectangle.displayArea(10,20);
        square.displayArea(10,20);

    }
}
