import java.util.Scanner;

public class MethodInvoking {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Compare two values, which one is the largest?? ");

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // invoke a maxFider method
        int result = maxFider(number1, number2);
        System.out.println("The largest number is : "+result);
    }

    // define a method
    public static int maxFider(int x, int y){

        int z;
        if (x > y)
            z = x;
        else
            z=y;
        return z;
    }
}