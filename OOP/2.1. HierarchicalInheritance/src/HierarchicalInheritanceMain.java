public class HierarchicalInheritanceMain {

    public static void main(String[] args) {

        System.out.println();
        A a = new A();
        a.methodA();

        System.out.println();
        B b = new B();
        b.methodB();
        b.methodA();

        System.out.println();
        C c = new C();
        c.methodC();
        c.methodB();
        c.methodA();

    }
}
