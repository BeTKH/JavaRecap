import java.util.Arrays;

public class SumFactor {

    public static void main(String[] args) {

        System.out.println(sumFact(new int[] {3, 0, 2, -5, 0}));
        System.out.println(sumFact(new int[] {9, -3, -3, -1, -1}));
        System.out.println(sumFact(new int[] {1}));
        System.out.println(sumFact(new int[] {0, 0, 0}));
        System.out.println(sumFact(new int[] {1, -1, 1, -1, 1, -1, 1}));

    }

    public static int sumFact( int[] list){

        int sumOfElements = 0;
        int SumF = 0;

        // calculate the sumOfElements
        for (int i = 0 ; i < list.length ; i++){
            sumOfElements += list[i];
        }

        // calculate the SumFact
        for (int j = 0 ; j < list.length ; j++){
            if (list[j] == sumOfElements)
                SumF++;
        }

        return SumF;
    }
}