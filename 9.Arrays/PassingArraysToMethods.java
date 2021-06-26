public class PassingArraysToMethods {
    public static void main(String[] args) {
        int x = 1;
        int[] numbersListArray = new int[10];

        System.out.println("before invoking the method x is : "+x);
        System.out.println("before invoking the method, the 1st value in the array is : "+numbersListArray[0]);

        // invoke a method
        methodThatPassesArrayandInt(x, numbersListArray);

        System.out.println("after invoking the method x is : "+x);
        System.out.println("after invoking the method, the 1st value in the array is : "+numbersListArray[0]);
    }

    public static void methodThatPassesArrayandInt(int number, int[] numbers){ // pass int and array to a method

        number = 100;
        //System.out.println("Inside the array the int value is "+number);
        numbers[0]=200;
    }
}