package shapes;

import feature.Shape;

import java.awt.geom.Area;

public class Rectangle extends Shape {

    float length;
    float breath;

    public Rectangle() {
        this.length = length;
        this.breath = breath;
    }

    @Override
    public void CalculateArea(float x, float y) {
       area = x * y ;
    }

    @Override
    public void CalculateArea() {
        area = this.length *this .breath ;

    }


}

