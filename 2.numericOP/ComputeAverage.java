import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {

        // create Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers to compute their avergae: ");

        System.out.print("The first number: ");
        double numberOne = input.nextDouble();

        System.out.print("The first number: ");
        double numberTwo = input.nextDouble();

        System.out.print("The first number: ");
        double numberThree = input.nextDouble();

        // avergae

        int averageNumber = (int)(numberOne + numberTwo + numberThree)/3;

        System.out.println("The average of "+ numberOne + ", "+ numberTwo + ", and "+ numberThree +" is: "+ averageNumber);
    }
}