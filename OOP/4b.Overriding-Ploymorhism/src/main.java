public class main {

    public static void main(String[] args) {


        Parent p = new Parent();
        p.marry();

        // in this case the child class prefers to use its own implementation

        // note that the methods have the same name and property in both parent and child class

        child c = new child();
        c.marry();


    }
}
