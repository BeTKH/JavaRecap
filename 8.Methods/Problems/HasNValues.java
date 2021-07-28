public class HasNValues {

    // main method
    public static void main(String[] args) {

        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 2));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 3));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 2));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20));

    }



    // hasNValues method
    public static int hasNValues( int a[] , int n){

        if (a.length < n)
            return 0;

        int[] uniqueArray = new int[n];
        int totalAdded = 0;
        boolean isUnique;

        for (int anA : a) {
            isUnique = false;
            for (int anUnique : uniqueArray) {
                if (anA == anUnique) {
                    isUnique = true;
                    break;
                }
            }

            if (!isUnique) {
                if (totalAdded >= n) return 0;
                uniqueArray[totalAdded] = anA;
                totalAdded++;
            }
        }


        if (totalAdded == n) return 1;
        return 0;

    }





}