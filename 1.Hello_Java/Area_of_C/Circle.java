import java.util.Scanner;

public class Circle {
    public static void main(String [] args){

        // declare a constant
        final double PI = 3.14159;

        // create an instance Scanner class ... create scanner object
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter radious of the circle: ");
        double radius = inputs.nextDouble();

        // calculate area
        double area = radius * radius * PI;

        System.out.println("Area of the circle is: "+area);
    }
}