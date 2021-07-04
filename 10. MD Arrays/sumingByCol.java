import java.util.Arrays;

public class sumingByCol {
    public static void main(String[] args) {
        int[][] matrix = {{2,3,5}, {7,1,8} };

        System.out.println("The matrix is : "+ Arrays.deepToString(matrix));

        for ( int col = 0 ; col < matrix[0].length ; col++){

            int total = 0;

            for ( int row = 0 ; row < matrix.length ; row++){
                total += matrix[row][col];

            }
            System.out.println("Sum for column "+col+" is "+total);
        }
    }
}