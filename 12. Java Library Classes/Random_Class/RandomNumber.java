import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        //Create a random object with seed
        Random random1 = new Random(3);

        // Generate 10 random numbers from random1 object
        System.out.println("From random1: ");
        for (int i = 0; i < 10 ; i++){
            System.out.println(random1.nextInt(1000)+ " ");
        }

        //Create a random object with seed
        Random random2 = new Random(3);

        // Generate 10 more random numbers from random2 object
        System.out.println("From random2: ");
        for (int i = 0; i < 10 ; i++){
            System.out.println(random2.nextInt(1000)+ " ");
        }

    }
}