import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // reverse the following array
        int[] lst = {20 , 30, 40, 50, 60};

        System.out.println("Before REV : "+Arrays.toString(lst));

        // create an object from ReverseArrays Class to use its method
        ReverseArrays rev = new ReverseArrays();

        //now use the revArray() method from the object and store the result of reversed array into result variable
        int[] result =  rev.revArray(lst);

        System.out.println("After REV : "+Arrays.toString(result));


        System.out.println("\n");


        // reverse the list of chars
        char[] lstofChars = {'A', 'B', 'C', 'D', 'E', 'F'};

        System.out.println("Chars Before REV : "+Arrays.toString(lstofChars));

        // create an obj to use a method from reverse arry
        ReverseArrays revChars = new ReverseArrays();

        // reverse
        char[] reversedListOfChars =  revChars.revChar(lstofChars);

        // show the result
        System.out.println("Chars after REV : "+Arrays.toString(reversedListOfChars));

    }
}
