import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        // generate number1
        int randomNumber_1 = (int) (Math.random() * 10);
        int randomNumber_2 = (int) (Math.random() * 10 + 5);

        int correctAnswer = randomNumber_1 + randomNumber_2;

        System.out.println("What is " + randomNumber_1 + " + " + randomNumber_2 + " ?");

        // accept user input

        Scanner input = new Scanner(System.in);

        System.out.print("Your answer:");
        int userAnswer = (int) (input.nextInt());

        if (userAnswer == correctAnswer) {
            System.out.println("Right, the answer is: " + userAnswer);
        }else {
            System.out.println(userAnswer+" is Wrong! The correct answer is: "+correctAnswer);
        }
    }
}