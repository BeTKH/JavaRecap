import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] list_  = {2,9,5,4,8,1,6};

        System.out.println("Before sorting : "+Arrays.toString(list_));

        int[] sorted_array = SortingMeth(list_);

        System.out.println("Sorted Array : "+Arrays.toString(sorted_array));

    }

    public static int[] SortingMeth( int[] array_){

        for( int k = 0; k < array_.length ; k++){

            int currentMin = array_[k];
            int currentMinIndex = k;

            for (int j = k + 1 ; j < array_.length ; j++){
                if (currentMin > array_[j]){
                    currentMin = array_[j];
                    currentMinIndex = j;
                }
            }

            //Swap
            if (currentMin != k){
                array_[currentMinIndex] = array_[k];
                array_[k] = currentMin;
            }
        }

        return array_;
    }

}