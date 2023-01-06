package abstraction.src.shapes;

import features.Shape;

public class Circle  implements Shape{
     @Override
       public float calculateArea(int x , int y){
         return shapes.PI*x*y;

         }

    @Override
    public void displayArea(int x, int y) {
        System.out.println((calculateArea(x, y)));
    }
}

