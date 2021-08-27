public class Car {

    public String model;
    public String color;
    public int numberOfSeats;

    // a method that displays object state
    public void displayCarState(){

        System.out.println("The model of the car is : "+model);
        System.out.println("The color of the car is : "+color);
        System.out.println("The number of the seats the car has is : "+numberOfSeats);

    }

    // define a constructor that can initialize an object

        /*
        *  constructor has no return type, not even void
        *  constructor name is same as class name
        * */

    Car(String mod, String  col, int seats){
        model = mod ;
        color = col;
        numberOfSeats = seats ;
    }

}
