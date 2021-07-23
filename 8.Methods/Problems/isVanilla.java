import java.util.Arrays;

public class isVanilla {

    public static void main(String[] args) {




        System.out.println(isVani(new int[]  {1}));
        System.out.println(isVani(new int[]  {11, 22, 13, 34, 125}));
        System.out.println(isVani(new int[]  {9, 999, 99999, -9999}));
        System.out.println(isVani(new int[]  { }));
        System.out.println();
        System.out.println(isVani(new int[]  {1, 1, 11, 1111, 1111111}));
        System.out.println(isVani(new int[]  {11, 101, 1111, 11111}));

    }

    public static int isVani( int[] list){
        // set a flag -- assume the list is vanilla initially
        int isVanilla = 1;

        if( list.length == 0){ // if its empty set .. its automatically vanilla
            isVanilla = 1;
        }else{

            // concatenate the numbers to form a string
            String stringNumber = "";
            for (int i = 0 ; i < list.length ; i++){

                // if the number is negative ... the sign shall not matter
                if (list[i] < 0){
                    stringNumber += Integer.toString(-1 * list[i]);
                }else{
                    stringNumber += Integer.toString(list[i]);
                }
            }

            //System.out.println(stringNumber);

            // the first character
            char prevDigit = stringNumber.charAt(0);
            for (int i = 0; i < stringNumber.length(); i++) {

                // if any of the next umber is different from the previous -- is NOT VANILLA -- change the flag -- and break the loop
                if (stringNumber.charAt(i) != prevDigit){
                    isVanilla = 0;
                    break;
                }

                // update the prev value
                prevDigit = stringNumber.charAt(i);
            }

        }


        return isVanilla;
    }
}