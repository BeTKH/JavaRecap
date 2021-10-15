/*
   --  ABSTRACT CLASS --

* ABSTRACT class is used to create other REGULAR classes
* ABSTRACT class is basically like a todo_list , specifies what methods and states the class MUST contain
* then the class created from an abstract class will implement the list specified by the abstract class

* object can't be directly created from an ABSTRACT class
* a REGULAR class can be created from abstract class by inheritance ( extending it)
* then an object can be created from it (REGULAR class)
*  ABSTRACT classes CAN CONTAIN aN ABSTRACT METHOD as well as a Regular METHOD ( implemented method)
**/


/* -- ABSTRACT METHOD--
* is a METHOD that is NOT IMPLEMENETED yet!
*/


/*
* THE KEY DIFFERENCE between ABSTRACT classes and an INTERFACE is that
*
* an ABSTRACT class can contain both ABSTRACT as well as regular methods and Variables!
* an INTERFACE contains only ABSTRACT methods and VARIABLES!!!
* */
interface DogInterface{

    /*
    * all methods in the interface are ABSTRACT ...
    * no need to specify like "public abstract"
    * */

    void bark();
    void eat();
    void run();
}

// implementing an interface by a kew word ...implements

class doggo implements DogInterface{

    public void bark() {
        System.out.println("doggo -barks!");
    }

    public void eat(){
        System.out.println("doggo -eats!");
    }

    public void run(){
        System.out.println("doggo -runs!");
    }
}

abstract class abstractDog {

    String breed;

    // REGULAR METHOD
    public void bark(){
        System.out.println("Bark!");
    }

    // ABSTRACT METHOD
    public abstract void eat();
}

// implementing an abstract class -- by inheritance -- extends key word
class Kora extends abstractDog{

    public void eat(){
        System.out.println("eat!");
    }

}

public class Main {
    public static void main(String[] args) {

        Kora b1 = new Kora();
        b1.bark();
        b1.eat();


        doggo d1 = new doggo();
        d1.bark();
        d1.eat();
        d1.run();

    }
}
