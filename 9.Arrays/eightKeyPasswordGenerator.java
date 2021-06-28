import java.util.Arrays;

public class eightKeyPasswordGenerator {
    public static void main(String[] args) {

        // create an arry of size 12 to store 12 characters
        char[] charArray = new char[12];
        System.out.println("empty array: "+ Arrays.toString(charArray));

        // generate 12 random characters and store in the above array
        for (int i = 0 ; i < 12 ; i++){
            charArray[i] = generateRandomChar('!','z');
        }

        System.out.println("an array that contains 12 random characters: "+Arrays.toString(charArray));


        //Create a password by concatenating the characters
        String newPassword  = "";
        for ( int k = 0 ; k < charArray.length ; k++){
            newPassword = newPassword+charArray[k];
        }
        System.out.println("\nYour generated password is : "+newPassword);

    }

    // method generates a random character
    public static char generateRandomChar(char ch1, char ch2){
        char randCharacter = (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
        return randCharacter;
    }

}