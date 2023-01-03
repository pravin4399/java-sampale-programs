package shapes;

import feature.Shape;

import java.util.concurrent.Callable;

public class Circle extends Shape {

    public Circle(){
        super();
    }
    public void calArea( float radius){
        CalculateArea(radius ,radius);
    }

    @Override
    public void CalculateArea(float x, float y) {
        area = Shape .PI * x * y ;
    }

    @Override
    public void CalculateArea() {

    }
}