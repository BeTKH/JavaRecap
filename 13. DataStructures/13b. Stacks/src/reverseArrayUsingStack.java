import java.util.Arrays;
import java.util.Stack;

public class reverseArrayUsingStack {

    public static void main(String[] args) {

        // create an arry
        int[] listNum = { 100, 200, 300, 400 };

        System.out.println("Before REV: "+Arrays.toString(listNum));

        int[] revArr = reverseArray(listNum);

        System.out.println("After  Rev: "+Arrays.toString(revArr));

    }

    // method that reverse an arry

    public static int[] reverseArray(int[] lst){

        // create stack object
        Stack<Integer> stk = new Stack<Integer>();

        // insert into the stack
        for (int i = 0; i < lst.length ; i++){
            stk.push(lst[i]);
        }

        // from the stack back to the arry
        for (int j = 0; j < lst.length ; j++){

            // take the top element from the stack and store in the array
            lst[j] = stk.pop();
        }

        return lst;

    }

}
