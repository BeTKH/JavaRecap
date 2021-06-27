import java.util.Arrays;

public class SwapArrayElements {
    public static void main(String[] args) {
        int[] arrayOfOddInts = {1,3,5,7,11};

        System.out.println("Array before swapping: "+ Arrays.toString(arrayOfOddInts));

        swapArray(arrayOfOddInts);

        System.out.println("Array after swapping: "+ Arrays.toString(arrayOfOddInts));
    }

    public static void swapArray(int[] array_x){
        int temp = array_x[0];

        array_x[0] = array_x[1];
        array_x[1] = temp;
    }
}