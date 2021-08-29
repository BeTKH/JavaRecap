import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksMain {

    public static void main(String[] args) {


        // Stacks
        Stack<String> games = new Stack<String>();

        games.add("Call of Duty");
        games.add("Guitar Hero");
        games.add("Super Monkey");
        games.push("JAJAJ");

        //System.out.println(games.peek());
        System.out.println(games);


        // Queues
        Queue<String > bbqLine = new LinkedList<>();
        bbqLine.add("Jack");
        bbqLine.add("Mat");

        System.out.println();

        System.out.println(bbqLine.peek());;
        System.out.println(bbqLine.toArray()[1]);
        System.out.println(bbqLine);


    }
}
