import java.sql.SQLOutput;
import java.util.Scanner;

public class SecToMinute {
    public static void main(String[] args) {
        // scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds/60;

        int remainingSeconds = seconds % 60;

        System.out.println(seconds+" Secinds are equivalent to "
                + minutes +" minutes and "
                + remainingSeconds+" seconds");

    }
}