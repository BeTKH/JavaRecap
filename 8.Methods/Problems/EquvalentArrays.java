public class EquvalentArrays {

    public static void main(String[] args) {


        System.out.println(equivalentArrays(new int[] {0, 1, 2}, new int[] {2, 0, 1}));
        System.out.println(equivalentArrays(new int[] {0, 1, 2, 1}, new int[] {2, 0, 1}));
        System.out.println(equivalentArrays(new int[] {2, 0, 1}, new int[] {0, 1, 2, 1}));
        System.out.println(equivalentArrays(new int[] {0, 5, 5, 5, 1, 2, 1}, new int[] {5, 2, 0, 1}));
        System.out.println(equivalentArrays(new int[] {5, 2, 0, 1}, new int[] {0, 5, 5, 5, 1, 2, 1}));
        System.out.println(equivalentArrays(new int[] {0, 2, 1, 2}, new int[] {3, 1, 2, 0}));
        System.out.println(equivalentArrays(new int[] {3, 1, 2, 0}, new int[] {0, 2, 1, 0}));
        System.out.println( equivalentArrays(new int[] {1, 1, 1, 1, 1, 1}, new int[] {1, 1, 1, 1, 1, 2}));
        System.out.println(equivalentArrays(new int[] {}, new int[] {3, 1, 1, 1, 1, 2}));
        System.out.println(equivalentArrays(new int[] {}, new int[] {}));

    }


    public static void equivalentArrays(int[] a1, int[] a2) {

        if ((a1.length == 0 )&&(a2.length == 0)){
            return 1;
        }

        for (int i = 0; i < a1.length ; i++){

            if (notINtheArray(a1[i], a2)){
                return 0;
            }
        }
    }

    


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