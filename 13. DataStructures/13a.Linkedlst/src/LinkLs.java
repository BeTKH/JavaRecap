import java.util.LinkedList;


/*
* LinkedList
* https://www.javatpoint.com/java-linkedlist
* - is a class implemented in java
* - is a data structure
* - each element knows the element before and after it
* - is ordered
* - stores a number as well as int mixed!
* */

public class LinkLs {

    public static void main(String[] args) {

        LinkedList<Integer> linkls = new LinkedList();

        linkls.add("Abebe");
        linkls.add(2);
        linkls.add("Bela");

        System.out.println(linkls);
        System.out.println("The 2nd element is : "+linkls.get(1));

    }
}
