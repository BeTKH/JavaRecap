import java.util.Stack;

interface arrayMan{
    int[] revArray(int[] lst);
    char[] revChar(char[] lst);
}

abstract class ArrayManipulator implements arrayMan{

    // regular method for reversing a list of Strings
    public char[] revChar(char[] lst){

        //create a stack
        Stack<Character> stkChar = new Stack<Character>();

        // store to the stack
        for (int r = 0 ; r < lst.length ; r++){
            stkChar.push(lst[r]);
        }

        // from stk to the arry
        for (int s = 0; s < lst.length ; s++){
            lst[s] = stkChar.pop();
        }

        return lst;
    }

    // abstract method for reversing an Int
    public abstract int[] revArray(int[] lst);

}

public class ReverseArrays extends ArrayManipulator{

    public int[] revArray(int[] _array){

        // create a stack
        Stack<Integer> stk = new Stack<Integer>();

        // store each array element in the stack
        for (int i = 0 ; i < _array.length ; i++){

            stk.push(_array[i]);
        }

        // store from the stack back  to the array
        for (int j = 0; j < _array.length ; j++){
            _array[j] = stk.pop();
        }

        return _array;

    }

}
