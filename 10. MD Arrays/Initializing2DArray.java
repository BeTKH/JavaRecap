import java.util.Arrays;
import java.util.Scanner;

public class Initializing2DArray {
    public static void main(String[] args) {

        int[][] matrix = new int[2][2];

        // init a 2D array with user input

        Scanner input = new Scanner(System.in);

        System.out.println("enter row and column values: ");

        for (int row = 0 ; row < matrix.length ; row++){
            for (int col = 0; col < matrix[row].length; col++){

                System.out.println("Enter a value for a row "+row+" and a column "+col);
                matrix[row][col] = input.nextInt();
            }
        }

        System.out.println("Your array is : "+Arrays.deepToString(matrix));
    }
}