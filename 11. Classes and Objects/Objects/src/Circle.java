public class Circle {

    double radius;

    /* construct a circle with radius 1.0 */
    Circle(){
        radius = 1.0;
    }

    /* construct a circle with radius with user input */
    Circle(double newRadius){
        radius = newRadius;
    }

    /* return area of the circle */
    protected double getArea(){
        return radius*radius*Math.PI;
    }
}
