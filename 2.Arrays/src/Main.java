import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        //System.out.print("Hello");

        int[] numbers = new int[5];

        // initialize an array
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers));


        int [] sequence = {9,3,1,5,6};
        Arrays.sort(sequence);
        System.out.println(Arrays.toString(sequence));

        // MD Arrays

        boolean [][] truthTable_2d = new boolean[2][3];

        truthTable_2d[0][0] = true;

        System.out.println(Arrays.deepToString(truthTable_2d)+"\n");


        // MD Names

        String [][] namesList = new String[4][2];
        namesList[0][0] = "firstName";
        namesList[0][1] = "lastName";

        namesList[1][0] = "Bekalu";
        namesList[1][1] = "Tadesse";

        System.out.println(Arrays.deepToString(namesList)+"\n");

        // MD names initialization way-2

        String [][] namesList2 = {{"firstName","lastName"},{"Bekalu", "Tadesse"}};

        System.out.println(Arrays.deepToString(namesList2));

        // MD Status

        boolean [][] onLine = {{true},{false}};
        System.out.println(Arrays.deepToString(onLine));

        // 3d Array

        int [][][] numberCube = new int[2][2][2];

        numberCube [0][0][0] = 1;
        System.out.println(Arrays.deepToString(numberCube));

        

    }
}
