import java.util.Arrays;

public class upCount {

    // main method
    public static void main(String[] args) {
        /* while summing up elements of an array:

        count instances of the partial sum  where it jumps from <= N to > N for any int input N

        */

        // let's create a 1D array

        int[] list_of_nums = {2, 3, 1, -6, 8, -3, -1, 2};

        System.out.println("The upcount for the array "+Arrays.toString(list_of_nums) + " is "+upCounter(list_of_nums, 5));

        System.out.println("The upcount for the array [6,3,1]  is : "+upCounter(new int[] {6,3,1}, 5));

        System.out.println("The upcount for the array [1,2,-1, 5,3,2,-3]  is : "+upCounter(new int[] {1,2,-1, 5,3,2,-3}, 20));
    }

    // upCounter method
    public static int upCounter( int[] list , int N){
        int nUpCount = 0;
        int partialSum = 0;
        int previousPartialSum = 0;

        for ( int i = 0 ; i < list.length ; i ++){
            previousPartialSum = partialSum;
            partialSum += list[i];

            if ( previousPartialSum <= N && partialSum > N)
                nUpCount ++;
        }
        return nUpCount;
    }
}