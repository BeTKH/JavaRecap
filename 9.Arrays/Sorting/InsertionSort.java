import java.util.Arrays;

public class InsertionSort {

    // main method
    public static void main(String[] args) {

        int[] target_arry = {2,9,5,4,8,1,6};
        System.out.println("\nThe array before sorting is : "+Arrays.toString(target_arry)+"\n");

        InsertionSort(target_arry);
    }

    // Insertion sort method

    public static void InsertionSort(int[] list) {

        for (int i = 1; i < list.length; i++) {

            int currentValue = list[i];
            int k ;
            for (k = i - 1; k >= 0 && list[k] > currentValue; k--) {

                list[k + 1] = list[k];
            }

            // Insert the current element
            list[k + 1] = currentValue;

            System.out.println("Sorting ... " + Arrays.toString(list));
        }
        System.out.println("\nSorted array is : " + Arrays.toString(list));
    }
}