import java.util.Scanner;

public class UsingMathMethods {

    public static void main(String[] args) {

        System.out.println("Converting trig sine angle to radians");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter sine angle to be converted into radians: ");
        double sineAngle = input.nextDouble();

        // invoke a toRadians method from the Math class
        double radianAngle = Math.toRadians(sineAngle);

        System.out.println("The angle in radians is : "+radianAngle);

    }



}