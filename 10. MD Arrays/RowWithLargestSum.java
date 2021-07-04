import java.util.Arrays;

public class RowWithLargestSum {
    public static void main(String[] args) {
        int[][] matrix = {  {41,2,3,4},
                            {115,6,7,8},
                            {1091,4,2,4}
                         };

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
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
    }
}