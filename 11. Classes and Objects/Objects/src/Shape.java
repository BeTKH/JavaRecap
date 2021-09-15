public class Shape {

    public static void main(String[] args) {

        Circle crcObj = new Circle();
        System.out.println(crcObj.radius);
        System.out.println(crcObj.getArea());

        System.out.println();
        Circle crcObj2 = new Circle(10.2);
        System.out.println("Radius of the circle: "+crcObj2.radius);
        System.out.println("Area of the circle: "+crcObj2.getArea());
        
    }

}
