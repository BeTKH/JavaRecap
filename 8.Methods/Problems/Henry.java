import java.util.Arrays;
import java.util.ArrayList;


public class Henry {

    // main
    public static void main(String[] args) {

        System.out.println(henryMethod(1,3));
    }


    // henry method
    public static int henryMethod( int i , int j ){

        // create a dynamic array
        ArrayList<Integer> henryList = new ArrayList<>();

        // serach for henry numbers until 10k
        for (int number = 1 ; number < 10000 ; number++){
            if (isPerfectNum(number))
                henryList.add(number);
        }


        System.out.println("Hnerys list of numbers are : "+henryList);

        // convert to a regular array
        Integer[] arr = new Integer[henryList.size()];
        arr = henryList.toArray(arr);

        System.out.println("The regular array is : "+Arrays.toString(arr));

        // return the sum of henry numbers from the array
        return arr[i-1] + arr[j-1];

    }


    // perfect number method
    public static boolean isPerfectNum( int number){

        boolean isPerfect = false;
        // sum of its factors
        int sumFactors = 0;
        for (int i = 1 ; i < number ; i++){
            if ( number % i == 0)
                sumFactors += i;
        }

        if (sumFactors == number){
            isPerfect = true;
        }

        return isPerfect;
    }

}