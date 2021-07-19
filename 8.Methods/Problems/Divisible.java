public class Divisible {

    public static void main(String[] args) {

        System.out.println(isDivisible(new int[] {3, 3, 6, 36} , 3));
        System.out.println(isDivisible(new int[] {4} , 2));
        System.out.println(isDivisible(new int[] {3, 4, 3, 6, 36} , 3));
        System.out.println(isDivisible(new int[] {6, 12, 24, 36} , 12));
        System.out.println(isDivisible(new int[] {} , 19));

    }

    public static int isDivisible (int[] list , int divisor){

        int divisible = 1;
        for (int indx = 0 ; indx < list.length ; indx++){
            if (list[indx] %  divisor != 0 ){
                divisible = 0;
                break;
            }


        }

        return divisible;
    }
}