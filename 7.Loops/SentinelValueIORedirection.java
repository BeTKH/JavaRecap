import java.util.Scanner;
public class SentinelValueIORedirection {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number, program exits if entered 0:  ");
        int data = input.nextInt();

        int sum = 0;

        while (data != 0){
            sum += data;

            System.out.print("Enter a number, program exits if entered 0:  ");
            data = input.nextInt();
        }
        System.out.println("The sum is : "+sum);
    }
}