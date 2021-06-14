import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {

        String set1 =
                " 1 3 5 7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31";
        String set2 =
                " 2 3 6 7\n" +
                " 10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31";
        String set3 =
                " 4 5 6 7\n" +
                " 12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31";
        String set4 =
                " 8 9 10 11\n" +
                " 12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31";
        String set5 =
                " 16 17 18 19\n" +
                " 20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31";

        // initialize day
        int day = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("\n\nOn which month were you born?\n");
        System.out.print("The month is: ");
        String birthMonth = input.next();

        // check set-1
        System.out.println("Is your BirthDay in Set-1 ?");
        System.out.println(set1);
        System.out.print("Enter 0 for No and 1 for Yes: \n");
        int answer = input.nextInt();

        if (answer ==1){
            day +=1;
        }

        // check set-2
        System.out.println("Is your BirthDay in Set-2 ?");
        System.out.println(set2);
        System.out.print("Enter 0 for No and 1 for Yes: \n");
        answer = input.nextInt();

        if (answer ==1){
            day +=2;
        }


        // check set-3
        System.out.println("Is your BirthDay in Set-3 ?");
        System.out.println(set3);
        System.out.print("Enter 0 for No and 1 for Yes: \n");
        answer = input.nextInt();

        if (answer ==1){
            day +=4;
        }

        // check set-4
        System.out.println("Is your BirthDay in Set-4 ?");
        System.out.println(set4);
        System.out.print("Enter 0 for No and 1 for Yes: \n");
        answer = input.nextInt();

        if (answer ==1){
            day +=8;
        }

        // check set-5
        System.out.println("Is your BirthDay in Set-5 ?");
        System.out.println(set5);
        System.out.print("Enter 0 for No and 1 for Yes: \n");
        answer = input.nextInt();

        if (answer ==1){
            day +=16;
        }

        System.out.println("\n\nYour BirthDay is on: "+birthMonth+", "+day+" !");
    }
}