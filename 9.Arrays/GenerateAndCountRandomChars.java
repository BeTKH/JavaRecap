import java.util.Arrays;

public class GenerateAndCountRandomChars {
    public static void main(String[] args) {

        // generate 100 random characters and store in the array

        char[] charArray = new char[100];
        System.out.println("before storing: "+Arrays.toString(charArray));

        for (int i = 0 ; i < 100 ; i++){
            charArray[i] = generateRandomChar('a','z');
        }

        System.out.println("after storing: "+Arrays.toString(charArray));

        //Count each occurance of characters in the array
        int[] count = countCharacters(charArray);
        System.out.println("Counted arrays : "+Arrays.toString(count)+"  has "+count.length+" elements!");


        for ( int k = 0 ; k < count.length ; k++){
            System.out.println(k+1+". "+charArray[k]+" --> count = "+count[k]+"\n");
        }

    }

    // method generates a random character
    public static char generateRandomChar(char ch1, char ch2){
        char randCharacter = (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
        return randCharacter;
    }

    // method for countig characters
    public static int[] countCharacters(char[] characters_array){
        int[] charCounts = new int[26];

        for (int r =0 ; r < characters_array.length ; r++){
            charCounts[characters_array[r] - 'a']++;
        }

        return charCounts;
    }
}