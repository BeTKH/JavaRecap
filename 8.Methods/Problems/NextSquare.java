import java.util.Scanner;

public class NextSquare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find the next perfect square number : ");
        int N = input.nextInt();

        System.out.println("The result is : "+nextPerfectSquare(N));

    }


    public static int nextPerfectSquare( int Num){

        int _floor, pSquare;

        if (Num == 0)
            return 1;
        else if (Num < 0)
            return 0;
        else
            _floor = (int)Math.sqrt(Num);
            pSquare = (int)Math.pow((_floor +1), 2);
            return pSquare;
    }
}