public class OverflowEffect {
    public static void main(String[] args) {

        // calc using int
        int maxIntValue = (int)(Math.pow(2,31))-1;

        int overFlowInt = (int)(Math.pow(2,31))+10;

        System.out.println("\n\n");

        System.out.println("value (2^31)-1 in int is: "+ maxIntValue);

        System.out.println("value (2^31)+10 in int is: "+ overFlowInt + "\n=>This number became negative because of the overflow effect! \n\n");


        // calc using double

        double maxOfInt = (double) (Math.pow(2,31))-1;
        double overOfInt = (double) (Math.pow(2,31))+10;

        System.out.println("value (2^31)-1 in double is: "+ maxOfInt);

        System.out.println("value (2^31)+10 in double is: "+ overOfInt);


    }
}