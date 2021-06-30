import java.util.Arrays;

public class SelectionSortNoMethod {
    public static void main(String[] args) {
        int[] list_  = {2,9,5,4,8,1,6};

        int[] array_ = new int[7];

        for( int k = 0; k < list_.length ; k++){

            int currentMin = list_[k];
            int currentMinIndex = k;

            for (int j = k + 1 ; j < array_.length ; j++){
                if (currentMin > array_[j]){
                    currentMin = array_[j];
                    currentMinIndex = j;
                }
            }

            //Swap
            if (currentMin != k){
                array_[currentMinIndex] = list_[k];
                array_[k] = currentMin;
            }
        }

        System.out.println("Unsorted : "+ Arrays.toString(list_));
        System.out.println("sorted : "+Arrays.toString(array_));
    }
}