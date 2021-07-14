import java.util.Arrays;
import java.util.Scanner;

public class PrimeCount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the start: ");
        int sta = input.nextInt();

        System.out.print("Enter the end: ");
        int end = input.nextInt();

        primeCounts(sta, end);

    }

    public static void primeCounts( int start, int end){

        int len = ( end - start ) + 1;
        int[] list_of_nums = new int[ (end - start)+1];

        list_of_nums[0] = start;
        list_of_nums[len -1] = end;

        for ( int i = 1 ; i < len-1 ; i ++){
            list_of_nums[i] = start + 1 ;
            start ++;
        }

        System.out.println("The array is : "+ Arrays.toString(list_of_nums));

        int[] primesList = new int[list_of_nums.length];

        for ( int r = 0 ; r < list_of_nums.length ; r++){


            if ( isPrime(list_of_nums[r]) )
                primesList[r] = list_of_nums[r];
        }

        System.out.println("Primes list is : "+Arrays.toString(primesList));

    }

    public static boolean isPrime( int n){
        if (n <= 1 )
            return false;
        for (int i =2 ; i < n ; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
}