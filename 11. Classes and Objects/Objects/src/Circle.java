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

    /* a method return area of the circle */
    protected double getArea(){
        return radius*radius*Math.PI;
    }

    public void setRadiusValue( double radii){
        radius = radii;
    }

    public double getRadiusValue( ){
        return radius;
    }
}
