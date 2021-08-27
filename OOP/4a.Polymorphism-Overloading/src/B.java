public class B extends A{

    public void methodB(){
        System.out.println("Mthod A - no arguments");
    }

    public void methodB( String x){
        System.out.println("Mthod A - one str argument");
    }

    public void methodB( String x, String y ){
        System.out.println("Mthod A - two str arguments");
    }
}
