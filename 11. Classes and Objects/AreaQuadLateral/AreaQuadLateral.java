public class AreaQuadLateral {

    public static void main(String[] args) {


        // create a rectangle object
        Quadrilateral rectangle = new Quadrilateral(3, 4);
        System.out.println("The area of the rectangle of length "+rectangle.length+"cm and width "+rectangle.width+ "cm is "+rectangle.getAreaOfQuadrilateral()+" cm^2");

        // create a Square object from Quadrilateral class
        Quadrilateral square = new Quadrilateral(5,5);

        System.out.println("The area of the square of length "+square.length+"cm and width "+square.width+ "cm is "+square.getAreaOfQuadrilateral()+" cm^2");
    }
}

class Quadrilateral{

    int length;
    int width;

    // constructor initialize variables of the class
    Quadrilateral( int newLength , int newWidth){

        length = newLength;
        width = newWidth;
    }

    // calculate area and return its value
    int getAreaOfQuadrilateral(){
        return length * width;
    }
}