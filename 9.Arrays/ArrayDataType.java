import java.util.Arrays;

public class ArrayDataType {
    public static void main(String[] args) {

        //when an array is created its elements are assigned the default value of empty space for the char primitive data types
        char[] characterList = new char[20];
        System.out.println("\nThe empty char array: "+Arrays.toString(characterList));

        //when an array is created its elements are assigned the default value of false for the boolean primitive data types
        boolean[] truthTable = new boolean[20];
        System.out.println("\nThe empty boolean array: "+Arrays.toString(truthTable));

        //when an array is created its elements are assigned the default value of 0 for the numeric primitive data types
        int numbersList[] = new int[20];
        System.out.println("\nThe empty numberslist array: "+Arrays.toString(numbersList));

    }
}