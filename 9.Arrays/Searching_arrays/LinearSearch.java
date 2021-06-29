import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        int[] list_odds = {1,3,5,7,11, 13};

        // accept a number from a user to search for
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number to search for in the array: ");
        int searh_key = (int)input.nextInt();

        int search_result = searchL(list_odds, searh_key);

        System.out.println("The result of the search is : "+search_result);
    }



    // a method that searches for a key
    public static int searchL(int[] list_ , int key_){
        for ( int k = 0 ; k < list_.length ; k++){
            if (list_[k] == key_)
                return k;
        }
        return -1;
    }
}