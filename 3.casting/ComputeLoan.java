import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter annaul interest rate: ");
        double annualInterest = input.nextDouble();
        double monthlyInterest = annualInterest /12;

        System.out.print("enter loan amount: ");
        double loanAmount =input.nextDouble();

        System.out.print("enter number of years: ");
        int numberOfYears =input.nextInt();

        double monthlyPayemnet = (loanAmount * monthlyInterest) / (1 - (1 / Math.pow((1 + monthlyInterest), (numberOfYears*12))));
        System.out.println("Monthly payment: "+monthlyPayemnet);
    }
}