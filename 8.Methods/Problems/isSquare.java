public class isSquare {

    public static void main(String[] args) {

        System.out.println(+isSq(4));
        System.out.println(isSq(25));
        System.out.println(isSq(-4));
        System.out.println(isSq(8));
        System.out.println(isSq(0));
        System.out.println(isSq(169));
        System.out.println(isSq(168));

    }


    public static int isSq( int number){

        // assume the number is not square initailly
        int theNumberIsSquare = 0;

        for ( int factor = 0 ; factor <= number ; factor ++){

            // change the flag is the number has a factor i.e. is a square
            if (factor * factor == number){
                //System.out.println(" The fcator is : "+factor);
                theNumberIsSquare = 1;
            }
        }
        return theNumberIsSquare;
    }
}