import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {

        int[] sourceArray = {1,3,5,7,9};

        //create an array of same size as the source array
        int[] targetArray = new int[sourceArray.length];
        System.out.println("Source Array: "+Arrays.toString(sourceArray));
        System.out.println("target array before copying :"+Arrays.toString(targetArray));

        // method-1 : iterate over the source array anc copy elements one by one

        for (int i = 0; i<sourceArray.length; i++){
            targetArray[i] = sourceArray[i];
        }

        // target array after copying
        System.out.println("target array after copying :"+Arrays.toString(targetArray));
        targetArray[0] = 100;

        System.out.println("target array after changing its value at index 0 :"+Arrays.toString(targetArray));
        System.out.println("Source Array after its elements copied: "+Arrays.toString(sourceArray));
    }
}