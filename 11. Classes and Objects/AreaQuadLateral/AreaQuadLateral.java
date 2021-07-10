public class AreaQuadLateral {
    public static void main(String[] args) {

    Quadrilateral rectangle = new Quadrilateral(3, 4);
    System.out.println("The area of the rectangle of length "+rectangle.length+" and width "+rectangle.width+ " is "+rectangle.getAreaOfQuadrilateral());

    }
}

class Quadrilateral{

    int length;
    int width;

    // constructor
    Quadrilateral( int newLength , int newWidth){

        length = newLength;
        width = newWidth;
    }

    int getAreaOfQuadrilateral(){
        return length *width;
    }
}