import java.util.Arrays;

public class Passing2DArrayToMethod {

    // main method
    public static void main(String[] args) {

        int[][] list = {  {41,2,3,4}, {115,6,7,8}, {1091,4,2,4} };

        int max = RowWithLargestSum(list);

        System.out.println("The max sum of rows for the array "+ Arrays.deepToString(list) + " is : " +max);

    }

    // method that adds 2D arrays and returns the value
    public static int RowWithLargestSum(int[][] matrix){

        int maxRow = 0;
        int indexOfMaxRow = 0;
        // Get sum of the first row in maxRow
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }

        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;

            for (int column = 0; column < matrix[row].length; column++){
                totalOfThisRow += matrix[row][column]; }

            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }

        return maxRow;

    }
}