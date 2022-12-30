import feature.Shape;
import shapes.Circle;
import shapes.Rectangle;

public class main {

    public static void main(String[] args) {

        Shape Circle = new Circle();
        Shape Rectangle = new Rectangle();
        Circle.CalculateArea( 10.5f,12.5f);
        Circle.displayArea();
        Rectangle.CalculateArea(10,20);
        Rectangle.displayArea();

    }
}