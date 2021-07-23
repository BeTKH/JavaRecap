import java.util.Arrays;

public class isIsolated {

    public static void main(String[] args) {


        System.out.println(isIsolatedNum(163));
        System.out.println(isIsolatedNum(162));

        System.out.println(isIsolatedNum(2));
        System.out.println(isIsolatedNum(3));
        System.out.println(isIsolatedNum(8));
        System.out.println(isIsolatedNum(9));
        System.out.println(isIsolatedNum(14));
        System.out.println(isIsolatedNum(24));
        System.out.println(isIsolatedNum(28));
        System.out.println(isIsolatedNum(34));
        System.out.println(isIsolatedNum(58));
        System.out.println(isIsolatedNum(63));


    }


    public static int isIsolatedNum( long Number){

        int isIsolated;


        if (Number * Number > Double.MAX_VALUE ){
            System.out.println(Double.MAX_VALUE);
             isIsolated = -1;
        }else{
            long[] sqDgList = squaredDigitList(Number);
            long[] cubDgList = cubedDigitList(Number);

             isIsolated = 1;
            for (int i = 0 ; i < cubDgList.length ; i++){

                for (int s = 0 ; s < sqDgList.length ; s++){

                    if (sqDgList[s] == cubDgList[i]){
                        isIsolated = 0;
                        break;
                    }
                }
            }
        }

        return isIsolated;

        }


    // squared digit list
    public static long[] squaredDigitList(long Num){

        long squareResult = Num*Num;
        int len = Long.toString(squareResult).length();

        long[] sqDigitsList = new long[len];

        for (int i = 0; i < len; i++) {
            sqDigitsList[i] = squareResult % 10;
            squareResult /= 10;
        }

        return sqDigitsList;

    }

    // cubed digit list
    public static long[] cubedDigitList(long Num){

        long cubeResult = Num*Num*Num;
        int len = Long.toString(cubeResult).length();

        long[] cubeDigitsList = new long[len];
        for (int i = 0; i < len; i++) {
            cubeDigitsList[i] = cubeResult % 10;
            cubeResult /= 10;
        }

        return cubeDigitsList;

    }
}