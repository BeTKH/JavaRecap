import java.util.Arrays;
import java.util.Scanner;

public class FindPorcNumber {

    // main
    public static void main(String[] args) {

        int result = findPorcNum(0);
        System.out.println(result);
        result = findPorcNum(138);
        System.out.println(result);
        result = findPorcNum(139);
        System.out.println(result);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value to search for proc number: ");

        int value = input.nextInt();
        result = findPorcNum(value);
        System.out.println("The next proc number is : "+result);

        int maxValue = Integer.MAX_VALUE;
        int[] listOfPorc = new int[10000];


    }

    // find PORC num

    public static int findPorcNum(int n){
        int porcupineNumber = 0;
        // declare an Integer variable that can accomodate the maximum possible positive integer value that can be represented in 32 bit
        int maxValue = Integer.MAX_VALUE;
        boolean isPorcupineNumber = false;
        n++;
        while(n <= maxValue){         // search until 2147483647
            if(isPorcupineNumber){   // once the proc number is found ( in the ELSE - IF )CHECK IF THE NEXT PRIME NUMBER ALSO ENDS WITH 9!
                if(isPrime(n) == 1){ // the number after the PROC number is prime
                    if(n % 10 == 9){ // the number after the PROC number also ends with 9
                        break;       // conditions are met --> exit here
                    }else{
                        isPorcupineNumber = false;
                    }
                }
            }else if( ( isPrime(n) == 1) && (n %10 == 9) ){   // is NOT porc above ... continue search here
                        isPorcupineNumber = true;
                        porcupineNumber = n; }
            n++;
        }
        return porcupineNumber;
    }




    // method that checks if a number is prime or not
    public static int isPrime( int Num){

        // Corner case
        if (Num <= 1 )
            return 0;
        // Check from 2 to n-1
        for (int i = 2 ; i < Num ; i++){
            if (Num % i == 0)
                return 0;
        }
        // otherwise
        return 1;
    }

    }