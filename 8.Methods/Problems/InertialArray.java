import java.util.ArrayList;
import java.util.Arrays;

public class InertialArray {

    // main
    public static void main(String[] args) {


        System.out.println("The result is : "+isInertial(new int[] {1})+" for the array "+Arrays.toString(new int[] {1}));

        System.out.println("The result is : "+isInertial(new int[] {2})+" for the array "+Arrays.toString(new int[] {2}));

        System.out.println("The result is : "+isInertial(new int[] {1, 2, 3, 4})+" for the array "+Arrays.toString(new int[] {1, 2, 3, 4}));

        System.out.println("The result is : "+isInertial(new int[] {1, 1, 1, 1, 1, 1, 2})+" for the array "+Arrays.toString(new int[] {1, 1, 1, 1, 1, 1, 2}));

        System.out.println("The result is : "+isInertial(new int[] {2, 12, 4, 6, 8, 11})+" for the array "+Arrays.toString(new int[] {2, 12, 4, 6, 8, 11}));

        System.out.println("The result is : "+isInertial(new int[] {2, 12, 12, 4, 6, 8, 11})+" for the array "+Arrays.toString(new int[] {2, 12, 12, 4, 6, 8, 11}));

        System.out.println("The result is : "+isInertial(new int[] {-2, -4, -6, -8, -11})+" for the array "+Arrays.toString(new int[] {-2, -4, -6, -8, -11}));

        System.out.println("The result is : "+isInertial(new int[] {2, 3, 5, 7})+" for the array "+Arrays.toString(new int[] {2, 3, 5, 7}));

        System.out.println("The result is : "+isInertial(new int[] {2, 4, 6, 8, 10})+" for the array "+Arrays.toString(new int[] {2, 4, 6, 8, 10}));

    }


    public static int isInertial( int[] array_){
        int isInertialArray = 0;
        if ( hasOdd( array_) && maxIsEven(array_) && everyOddIsGrater(array_)){
            isInertialArray = 1;
        }else{
            isInertialArray = 0;
        }

        return isInertialArray;
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
    public static boolean everyOddIsGrater( int[]  array_) {

        boolean oddsAreGreater = false;

        int[] oddValues = new int[array_.length];
        int[] evenValues = new int[array_.length];
        int oddValuesIndex = 0;
        int evenValuesIndex = 0;

        for (int index = 0; index < array_.length; index++) {
            if ((array_[index] % 2) != 0) {

                oddValues[oddValuesIndex] = array_[index];
                oddValuesIndex++;
            } else {
                evenValues[evenValuesIndex] = array_[index];
                evenValuesIndex++;
            }


        }

        for(int oddIndex = 0; oddIndex < oddValuesIndex; oddIndex++){
            for(int evenIndex = 0; evenIndex < evenValuesIndex; evenIndex++){

                if(evenValues[evenIndex] != maxVlaue(array_)){ // when there ARE other even numbers less than maximum even

                    if(oddValues[oddIndex] > evenValues[evenIndex]){ // each odd number must be grater than the even numbers expt max even
                        oddsAreGreater = true;
                    }
                }else{  // when there is no even number other than the maximum
                    oddsAreGreater = true;
                    break;
                }

            }

        }
        
        return oddsAreGreater;

    }



    public static boolean isOdd( int number){
        boolean isOddNumber = false;
        if (number % 2 != 0){
            isOddNumber = true;
        }else {
            isOddNumber = false;
        }

        return isOddNumber;
    }

    public static boolean isEven( int number){
        boolean isEvenNumber = false;
        if (number % 2 == 0 ){
            isEvenNumber = true;
        }else {
            isEvenNumber = false;
        }
        return  isEvenNumber;
    }

    public static int maxVlaue( int [] list){

        int maxValue = 0;
        for ( int i = 0 ; i < list.length ; i++){
            if ( list[i] > maxValue)
                maxValue = list[i];
        }

        return maxValue;

    }


}