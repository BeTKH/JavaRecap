public class convertToBase10 {

    // main method
    public static void main(String[] args) {

        System.out.println(toBase10(new int[] {1, 0, 1, 1}, 2));
        System.out.println(toBase10(new int[] {1, 1, 2}, 3));
        System.out.println(toBase10(new int[] {3, 2, 5}, 8));
        System.out.println(toBase10(new int[]  {3, 7, 1}, 6));

    }


    // converter method

    public static int toBase10(int[] list, int base){

        int base10Value = 0;

        // if legal calculate the base 10 value, if not return 0
        if( isLegal(list, base) == 1){

            int powerValue = 0;
            for (int i = list.length -1 ; i >= 0 ; i--){

                base10Value += list[i] * Math.pow(base, powerValue ) ;   // example:  1 * (2 ^ 0) for the last digit in 1101
                powerValue++;                                            // incremet the power

            }

            return base10Value;
        }else{ // when illegal number return 0
            return 0;
        }


    }



    // the isLegal method
    public static int isLegal( int[] list , int base){


        // set a flag -- assume the number is legal first
        int isLegal = 1;

        for (int i = 0 ; i < list.length ; i++){

            // each digit of a number must be less than its base
            // if we find ONE INSTANCE where the digit exceeds the base --> its ILLEGAL => change the flag
            if (list[i] >= base){
                isLegal = 0;
                break;
            }
        }

        return isLegal;

    }
}