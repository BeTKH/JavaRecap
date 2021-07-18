import java.util.Arrays;

public class isRepsEqual {

    public static void main(String[] args) {

        System.out.println( repsEq(new int[] {3, 2, 0, 5, 3} , 32053) );
        System.out.println( repsEq(new int[] {3, 2, 0, 5} , 32053) );
        System.out.println( repsEq(new int[] {3, 2, 0, 5, 3, 4}, 32053) );
        System.out.println( repsEq(new int[] {2, 3, 0, 5, 3} , 32053) );
        System.out.println( repsEq(new int[] {9, 3, 1, 1, 2}, 32053) );
        System.out.println( repsEq(new int[] {0, 3, 2, 0, 5, 3}, 32053) );

    }


    public static int repsEq( int[] list , int number ){

        int calculatedNumber = 0;
        int pwr = list.length - 1;
        int repsEqual = 0;

        // calculate the actual number
        for (int i = 0 ; i < list.length ; i++){

            calculatedNumber += (int)(list[i] * Math.pow(10, pwr));
            pwr--;
        }

        if ( number == calculatedNumber)
            repsEqual = 1;
        else
            repsEqual = 0;

        return repsEqual;
    }
}