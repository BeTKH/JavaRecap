public class MainOverloading {

    public static void main(String[] args) {

        A a = new A();

        a.methodA();

        B b = new B();
        //b. a total of 6 methods are available 3 inherited from class A;
        b.methodB("abebe");
        b.methodA(2,3);

    }
}
