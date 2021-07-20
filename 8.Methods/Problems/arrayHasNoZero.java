public class arrayHasNoZero {

    public static void main(String[] args) {

        System.out.println(hasNoZero(new int[] {1,2,3}));
        System.out.println(hasNoZero(new int[] {1,0,4, 0}));
        System.out.println(hasNoZero(new int[] {1,2,3, 0}));
        System.out.println(hasNoZero(new int[] {0,0,0,0}));
        System.out.println(hasNoZero(new int[] {}));

    }


    public static int hasNoZero( int[] list){

        int hasNoZ = 1; // set a flag to 1 -- assuming that there is no zero in the array

        for (int i = 0 ; i < list.length ; i++){

            // check if any of the values equl to zero if so break the loop  and change the flag
            if (list[i] == 0){
                hasNoZ = 0;
                break;
            }
        }

        return hasNoZ;
    }
}