import java.util.Arrays;

public class Initializing2DArrayRandNums {
    public static void main(String[] args) {

        int[][] matrix = new int[4][5];
        for (int row = 0 ; row < matrix.length ; row++){
            for (int col = 0; col < matrix[row].length; col++){

                matrix[row][col] = (int)(Math.random()*100+12);
            }
        }
        System.out.println("Your array is :" +Arrays.deepToString(matrix));
    }
}

