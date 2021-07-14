import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class PrimeCountII {

    // main method

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int startNumber = input.nextInt();

        System.out.print("Enter the last number: ");
        int endNumber = input.nextInt();

        //Call a method to create a list of numbers to be checked
        int[] list = createListOfNumbers(startNumber, endNumber);
        System.out.println("The list of numbers to be checked are : "+ Arrays.toString(list));

        // Call to prime counter method
        int primeCounts = primeCounter(startNumber, endNumber);

        System.out.println("The prime count is : "+primeCounts);

        listOfPrimes(list);

    }

    // method that generates an array ... list of numbers to be checked
    public static int[] createListOfNumbers( int start , int end){
        // create an array of numbers
        int arrayLength = ( end - start ) +1 ;

        int[] listOfNumbers = new int[arrayLength];

        for (int i = 0 ; i < listOfNumbers.length ; i++){

            listOfNumbers[i] = start;
            start ++;
        }

        return listOfNumbers;
    }


    // prime counter method
    public static int primeCounter( int startNumber, int endNumber){

        // initialize the prime count
        int primeCount = 0;

        for ( int number = startNumber ; number <= endNumber ; number++){
            //System.out.println(number);
            if (isPrime(number)){
                //System.out.println("is prime : "+number);
                primeCount++; }
            }

        return primeCount;
    }

    // method that checks if a number is prime or not
    public static boolean isPrime( int Num){

        // Corner case
        if (Num <= 1 )
            return false;
        // Check from 2 to n-1
        for (int i = 2 ; i < Num ; i++){
            if (Num % i == 0)
                return false;
        }
        // otherwise
        return true;
    }

    // method that returns list of prime numbers from the list of numbers to be checked
    public static void listOfPrimes( int[] allList){

        //create an arrayList -- array of variable length
        ArrayList<Integer> listofprimes = new ArrayList<>();

        for (int i = 0 ; i < allList.length ; i++){
            if (isPrime(allList[i])){
                    listofprimes.add(allList[i]);
            }
        }

        System.out.println("The list of prime numbers are : "+listofprimes.toString());
    }





}