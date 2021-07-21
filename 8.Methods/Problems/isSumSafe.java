public class isSumSafe {

    public static void main(String[] args) {

        System.out.println(sumSafe(new int[] {5, -5, 0}));
        System.out.println(sumSafe(new int[] {5, -2, 1}));
        System.out.println(sumSafe(new int[] {5, 5, 15}));
        System.out.println(sumSafe(new int[] {5, 5, 0, -10}));

    }

    public static int sumSafe(int[] list){


        int isSumSafe = 1;    // assume the array is sum safe initially

        // calculate the array total
        int sumOfArray = 0;
        for (int i = 0 ; i < list.length ; i++){
            sumOfArray += list[i];
        }

        // compare the sum with the array elements
        for (int j = 0 ; j < list.length ; j++){

            if (list[j] == sumOfArray){  // if any of array elements equal to the sum --> is NOT sum safe
                isSumSafe = 0;
                break;
            }

        }

        return isSumSafe;
    }
}