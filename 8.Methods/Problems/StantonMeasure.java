public class StantonMeasure {

    public static void main(String[] args) {


        System.out.println(StantMeasure( new int[] {1}));
        System.out.println(StantMeasure( new int[] {0}));
        System.out.println(StantMeasure( new int[] {3, 1, 1, 4}));
        System.out.println(StantMeasure( new int[] {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
        System.out.println(StantMeasure( new int[] {}));
        System.out.println(StantMeasure( new int[] {1, 4, 3, 2, 1, 2, 3, 2}));

    }


    public static int StantMeasure( int[] list ){

        int oneCounts = 0;
        int impliedCounts = 0;

        // calculate oneCounts
        for (int i = 0 ; i < list.length ; i++){
                if (list[i] ==1)
                    oneCounts++;
        }

        // calculte the implied counts
        for ( int k = 0 ; k < list.length ; k++){
            if (list[k] == oneCounts)
                impliedCounts++;
        }

        return impliedCounts;
    }
}