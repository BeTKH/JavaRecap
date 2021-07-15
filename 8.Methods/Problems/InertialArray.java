import java.util.ArrayList;
import java.util.Arrays;

public class InertialArray {

    // main
    public static void main(String[] args) {

        // create a new array
        int[] list = {11, 4, 20, 9, 2, 8};
        System.out.println("The array is : "+ Arrays.toString(list));

        boolean hasOddResult = hasOdd(list);

        System.out.println("Does the array "+Arrays.toString(list) + " has odd in it ?  The answer is : "+hasOddResult);
        System.out.println(" Is the maximum value even too? "+Arrays.toString(list) + "The answer is : "+maxIsEven(list));

        everyOddIsGrater(list);



    }


    public static void isInertial( int[] array_){

        // has at least one odd value
        //hasOdd( int[] array_);

        // max value is even
        //maxIsEven( int[] array);

        // every odd > every even except the maximum value
        //evryOddIsGrater( int array_);
    }


    // has at least one odd value
    public static boolean hasOdd( int[] array_){

        boolean hasOdd = false;
        for ( int i = 0 ; i < array_.length ; i++){
            if (array_[i] % 2 != 0){
                hasOdd = true;
                break;
            } else {
                hasOdd = false;
            }
        }
        return hasOdd;
    }

    // method that checks if the max value is even
    public static boolean maxIsEven( int[] array_){

        // first find the max value
        int maxValue = 0;

        for (int i = 0 ; i < array_.length ; i++){

            if( array_[i] > maxValue){
                maxValue = array_[i];
            }
        }
        boolean isMaxandEeven = false;

        if (maxValue % 2 == 0){
            isMaxandEeven = true;
        }else {
            isMaxandEeven = false;
        }

        return isMaxandEeven;

    }

    // a method that checks if every odd is grater except the max
    public static void everyOddIsGrater( int[]  array_) {

        ArrayList<Integer> listofOdds = new ArrayList<>();
        ArrayList<Integer> listofEevens = new ArrayList<>();

        for (int i = 0; i < array_.length; i++) {

            if (array_[i] % 2 == 0) {
                listofEevens.add(array_[i]);
            } else {
                listofOdds.add(array_[i]);
            }

        }

        System.out.println("The odds are " + listofOdds.toString());
        System.out.println("The evens are " + listofEevens.toString());

    }


}