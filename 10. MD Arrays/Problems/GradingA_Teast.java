import java.util.Arrays;

public class GradingA_Teast {

    // main method
    public static void main(String[] args) {

        //Students' answers to a multiple choice quiz

        char [][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'} };

        System.out.println("The answers from 8 students for 10 questions is "+ Arrays.deepToString(answers));

        char [] correctAnswers = {'D', 'B','D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        System.out.println("\nThe correct answers are : "+Arrays.toString(correctAnswers));

        int [][] scoreMatrix = ScoreMatrix(answers, correctAnswers);

        System.out.println("The score matrix of the evaluation is : "+Arrays.deepToString(scoreMatrix));

    }

    // method that evaluates each students answer and returns a 2D array that contains the result of the evaluation
    public static int[][] ScoreMatrix(char [][] listOfAnswers, char [] keys_){

        int[][] ScoreMatrixOfAllStudents = new int[8][10];
        int[] gradeMatrixOfAStudent = new int[10];

        for( int rows = 0; rows <listOfAnswers.length; rows++){
            for (int cols = 0 ; cols <listOfAnswers[rows].length ; cols++){

                //System.out.println(listOfAnswers[rows][cols]);

                if(listOfAnswers[rows][cols] == keys_[cols])
                    gradeMatrixOfAStudent[cols] = 1;
            }
            //System.out.println(Arrays.toString(gradeMatrixOfAStudent));
            ScoreMatrixOfAllStudents[rows] = gradeMatrixOfAStudent;

            //System.out.println(Arrays.deepToString(ScoreMatrixOfAllStudents));
            //break;
        }

        return ScoreMatrixOfAllStudents;
    }
}