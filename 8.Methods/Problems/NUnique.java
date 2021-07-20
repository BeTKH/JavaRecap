public class NUnique {

    // main method
    public static void main(String[] args) {

        System.out.println(isUnique(new int[] {7, 3, 3, 2, 4}, 6));
        System.out.println(isUnique(new int[] {7, 3, 3, 2, 4}, 10));
        System.out.println(isUnique(new int[] {7, 3, 3, 2, 4}, 11));
        System.out.println(isUnique(new int[] {7, 3, 3, 2, 4}, 8));
        System.out.println(isUnique(new int[] {7, 3, 3, 2, 4}, 4));
        System.out.println(isUnique(new int[] {1}, 2));

    }


    // isUnique method

    public static int isUnique( int[] list , int N){


        int sumsThatEqualN = 0;

        // grab the first element from the array
        for (int i = 0 ; i < list.length ; i++){

            // grab the next element from the array
            for (int j = i + 1 ; j < list.length ; j++){

                // checek if the sum equals with N and count  instances of such cases
                if (list[i]+list[j] == N)
                    sumsThatEqualN++;

                //System.out.println("Sums that equal with "+N+" are: "+sumsThatEqualN);
            }

        }


        // return value check
        if ( sumsThatEqualN == 1){
            return 1;
        }else{
            return 0;
        }

    }
}