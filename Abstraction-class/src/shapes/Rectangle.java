package shapes;

import feature.Shape;

import java.awt.geom.Area;

public class Rectangle extends Shape {

    public Rectangle() {
        super();
    }

    @Override
    public void CalculateArea(float x, float y) {
        area = x * y ;
    }
}

