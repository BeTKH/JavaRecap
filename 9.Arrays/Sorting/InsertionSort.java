import java.util.Arrays;

public class InsertionSort {

    // main method
    public static void main(String[] args) {

        int[] target_arry = {2,9,5,4,8,1,6};
        System.out.println("The array before sorting is : "+Arrays.toString(target_arry));
    }

    // Insertion sort method

    public static void InsertionSort(int[] list){
        for (int i = 1 ; i < list.length ; i++)

            double currentValue = list[i];

            for (int k = i - 1 ; k >= 0 && list[k] > currentValue ; k--){

                list[k+1] = list[k];
            }

            // Insert the current element
            list[k+1] = currentValue;

        System.out.println("The sorted array is : "+Arrays.toString(list));
    }
}