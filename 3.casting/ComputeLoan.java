import java.text.NumberFormat;
import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("enter annaul interest rate: ");
        double annualInterest = input.nextDouble();
        double monthlyInterest = annualInterest /12;

        System.out.print("enter number of years: ");
        int numberOfYears =input.nextInt();

        System.out.print("enter loan amount: ");
        double loanAmount =input.nextDouble();

        double cpdIntr = Math.pow(1+monthlyInterest, numberOfYears *12);

        double monthlyPayemnet = loanAmount * monthlyInterest * cpdIntr / (cpdIntr -1);

        NumberFormat currencyValue = NumberFormat.getCurrencyInstance();

        String result = currencyValue.format(monthlyPayemnet/12);

        System.out.println("Monthly payment amount is: "+result);
    }
}