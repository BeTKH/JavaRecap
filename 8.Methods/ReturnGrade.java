import java.sql.SQLOutput;
import java.util.Scanner;

public class ReturnGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score out of 100: ");

        double score = input.nextDouble();

        System.out.println("Your letter grade is: "+getGrdae(score));
    }

    public static char getGrdae(double mark) {
        if (mark >= 90)
            return 'A';
        else if (mark >= 80)
            return 'B';
        else if (mark >= 70)
            return 'C';
        else if (mark >= 60)
            return 'D';
        else
            return 'F';
    }
}