import java.util.Arrays;

public class computeDepth {

    public static void main(String[] args) {

        depth(42);

    }


    public static void depth( int n){

        int[] contributedList = new int[10];
        System.out.println("contribution count length : "+contributedList.length);
        int contributionCount = 0;

        for (int i = 1; i <=  n ; i++){

            int result = i*n;

            // grab each digit
            while (result > 0) {

                int digit = result%10;
                System.out.println(digit);

                //if the number is not in the contributed list ... add it into the contributed list
                if (notInArray(digit, contributedList)){

                                System.out.println("Contributed digit is : "+digit+" placed at index : "+i);
                                contributedList[i-1] = digit;
                                contributionCount++;
                                break;

                }

                result = result / 10;
            }
            if (contributionCount == 10){
                break;
            }
            //break;
        }

        System.out.println("The contributed list is : "+ Arrays.toString(contributedList));
    }

    // check if the number is not in the array
    public static boolean notInArray( int number , int[] list){

        boolean isInNotArray = true;

        for (int i = 0 ; i < list.length ; i++){

            if (number == list[i]){
                isInNotArray = false;
                break;
            }
        }

        if (number == 0){
            isInNotArray = true;
        }

        return isInNotArray;

    }
}