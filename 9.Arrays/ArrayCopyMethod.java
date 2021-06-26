import java.util.Arrays;

public class ArrayCopyMethod {
    public static void main(String[] args) {

        int[] sourceArray = {1,3,5,7,11,13};

        int[] targetArray = new int[10];

        System.out.println("Source Array: "+ Arrays.toString(sourceArray));
        System.out.println("target array before copying :"+Arrays.toString(targetArray));

        System.arraycopy(sourceArray,1,targetArray,2,4);

        System.out.println("Source Array: "+ Arrays.toString(sourceArray));
        System.out.println("target array after copying :"+Arrays.toString(targetArray));
    }
}