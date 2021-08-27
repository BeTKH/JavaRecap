class Engine{

    public String nameOfEngine = "V8";

    public void eng(){
        System.out.println("the engine!");
    }

}

public class Car {

    public static void main(String[] args) {

        Engine e = new Engine();
        e.eng();
        System.out.println("the name of the engine is : "+e.nameOfEngine);

    }

}
