import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    //main method
    public static void main(String[] args) {

         int[] list_ofNums = {2,4,7,10,11,45,50,59,60,66,69,70,79};

        System.out.println(list_ofNums.length);
        System.out.println(Arrays.toString(list_ofNums));


        Scanner input = new Scanner(System.in);
        System.out.print(" enter a key to search for in the array: ");

        int search_key = input.nextInt();

        int result_ofBSearch = SearchB(list_ofNums, search_key);
        System.out.println("The indes of the search key is : "+result_ofBSearch);
    }

    // Binary searching method
    public static int SearchB( int[] array_ , int key_){

        int low_ = 0;
        int high_ = array_.length-1;


        while (high_ >= low_){
            
            //Calculate the new middle point
            int mid_ = (low_ + high_) / 2;

            if (key_ < array_[mid_])
                high_ = mid_ - 1                                                                                                                                                                                                                   ;
            else if (key_ == array_[mid_])
                return mid_; else                       
            else
                low_ = mid_ + 1;
            }           System                                                                                                                                                                                                                                                             
            return -1;

    }

}