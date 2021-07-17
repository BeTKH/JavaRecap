public class CountSquarePairs {

    // main
    public static void main(String[] args) {

        int result = countSquarePairs(new int[]{11, 5, 4, 20});
        System.out.println(result);
        result = countSquarePairs(new int[]{9, 0, 2, -5, 7});
        System.out.println(result);
        result = countSquarePairs(new int[]{9});
        System.out.println(result);

    }

    // cont square pairs
    public static int countSquarePairs(int[] list_){

        int countSquarePairs = 0;

        // grab the index of the first value to be compared
        for(int targetIndex = 0; targetIndex < list_.length; targetIndex++){

            // grab the index of the 2nd value to be compared
            for(int compareIndex = 0; compareIndex < list_.length; compareIndex++){


                // check the condition : (X >0 and Y >0 )&& ( X<Y) && (X+Y is perfect square)
                if( (list_[targetIndex] > 0 && list_[compareIndex] > 0) && (list_[targetIndex] < list_[compareIndex]) && (isPerfectSqaure(list_[targetIndex] + list_[compareIndex]))){
                            countSquarePairs ++;
                        }
                    }
                }

        return countSquarePairs;
    }


    // is perfect square
    public static boolean isPerfectSqaure( double N){

        double result = Math.sqrt(N);

        if( (result == (int)result ) && ( N > 0)){
            return true;
        }else{
            return false;
        }
    }
}