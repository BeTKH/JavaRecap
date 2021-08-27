public class InheritanceMain {

    public static void main(String[] args) {

        Car c = new Car();
        c.carMthod();

        System.out.println();

        Ferari f = new Ferari();
        f.ferariMethod();
        f.carMthod();

        System.out.println();

        A a = new A();
        a.displayA();

        B b = new B();
        b.displayB();
        b.displayA();

    }
}
