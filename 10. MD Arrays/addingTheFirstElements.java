import java.util.Arrays;

public class addingTheFirstElements {
    public static void main(String[] args) {

        int[][] matrix = {{13,2,3,4}, {7,6,7,8}, {2,3,4,6}};

        System.out.println("The 2D array is : "+ Arrays.deepToString(matrix));

        int sum = 0;
        for( int row = 0 ; row <matrix.length ; row++){

            for (int col = 0 ; col < matrix[row].length - 3 ; col++){
                sum += matrix[row][col];
            }
        }

        System.out.println("The sum is : "+sum);
    }
}