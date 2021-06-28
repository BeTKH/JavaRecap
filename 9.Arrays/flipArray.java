import java.util.Arrays;

public class flipArray {
    public static void main(String[] args) {

        int[] primeNumersList = {1,3,5,7,11,13,17,19};

        System.out.println("arry before flipping: "+ Arrays.toString(primeNumersList));

        int[] flipped = arrayFlipper(primeNumersList);

        System.out.println("Flipped array: "+Arrays.toString(flipped));

    }

    // this method returns an arry
    public static int[] arrayFlipper(int[] array_Input){
        int[] flippedArray_output = new int[array_Input.length];

        for(int i=0, j=flippedArray_output.length-1  ; i < array_Input.length ;  i++,j--){
            flippedArray_output[j] =array_Input[i];
        }
        return flippedArray_output;
    }

}