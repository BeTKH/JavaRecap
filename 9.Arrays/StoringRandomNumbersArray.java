import java.util.Scanner;
import java.util.Arrays;

public class StoringRandomNumbersArray {
    public static void main(String[] args) {

        // ask a user how many random numbers to generate
        Scanner input = new Scanner(System.in);
        System.out.println("How many random numbers would u like to generate?");

        System.out.print("\nenter here: ");
        int numberOfRandomNumbers = input.nextInt();

        int sumOfRandomNumbers = 0;
        int lowerBound = 1;
        int upperBound = 200;

        // create an array that can store random number generated as per user request
        int[] numbers = new int[numberOfRandomNumbers];
        System.out.println("\nThe empty array: "+Arrays.toString(numbers));


        for ( int i = 0; i < numberOfRandomNumbers ; i++){

            // generate a random number
            int rand = (int)(Math.random() * upperBound) + lowerBound;

            //store the random number in to the array
            numbers[i] = rand;
            sumOfRandomNumbers = sumOfRandomNumbers + numbers[i];
        }

        System.out.println("\nThe random numbers generated are: "+Arrays.toString(numbers));
        System.out.println("\nThe length of the Array is : "+numbers.length);

        double averageOfRandomNumbers = sumOfRandomNumbers / numbers.length;
        System.out.println("\n\nAverage of Random Numbers is : "+averageOfRandomNumbers);


        // number of random numers generated that are above average
        int count = 0;
        for (int j=0; j<numberOfRandomNumbers; j++){
            if (numbers[j] > averageOfRandomNumbers)
                count++;
        }

        System.out.println("\nThe count of random numbers that are above avergae are: "+count);
    }
}