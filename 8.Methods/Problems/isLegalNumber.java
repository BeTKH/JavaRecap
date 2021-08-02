public class isLegalNumber {

    // main method
    public static void main(String[] args) {

        System.out.println(isLegal(new int[] {3, 2, 1} , 4));
        System.out.println(isLegal(new int[] {3, 7, 1} , 6));
        System.out.println(isLegal(new int[] {1, 1, 0} , 2));
        System.out.println(isLegal(new int[] {1, 2, 1} , 2));
        System.out.println(isLegal(new int[] {8, 2, 1} , 8));


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