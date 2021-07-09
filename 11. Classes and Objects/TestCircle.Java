public class TestCircle {
    public static void main(String[] args) {

        // Create a circle with radius 1.0
        Circle circleWithRad1 = new Circle();
        System.out.println("The area of the Circle of radius is "+circleWithRad1.radius +" is "+circleWithRad1.getArea());


        // Create a circle with radius of 25
        Circle circleWithRad2 = new Circle(25);
        System.out.println("The area of the Circle of radius is "+circleWithRad2.radius +" is "+circleWithRad2.getArea());

        // Create a circle with radius of 125
        Circle circleWithRad3 = new Circle(125);
        System.out.println("The area of the Circle of radius is "+circleWithRad3.radius +" is "+circleWithRad3.getArea());
    }
}

// define a Circle class with TWO Constructors
class Circle{

    double radius;

    // Constructor - constructs a circle with a radius of 1

    /** Construct a circle with radius 1 */
    Circle(){
        radius = 1.0;
    }

    /** - Construct a circle with a specified radius
        - This constructor is used to initialize the Radius of the Circle => set a value for the radius declared above
     **/

    Circle( double newRadius){
        radius = newRadius;
    }

    /** Return the area of this circle */

    double getArea(){
        return radius * radius * Math.PI;
    }

}