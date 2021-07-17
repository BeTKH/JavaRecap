public class GuthIndx {

    public static void main(String[] args) {

        System.out.println(GuthIndex(1));
        System.out.println(GuthIndex(2));
        System.out.println(GuthIndex(3));
        System.out.println(GuthIndex(4));
        System.out.println(GuthIndex(42));
        System.out.println(GuthIndex(7));

    }


    public static int GuthIndex( int number){

        int guthIndx = 0;

        if (number > 1 ){       // initial check ... the number has to be positive
            while (number != 1){    // exit condition ...when the number is 1 ... stop looping

                if (number % 2 == 0){
                    number = number / 2;

                }else{
                    number = (number * 3) + 1 ;
                }
                guthIndx++;
            }
        }

        return  guthIndx;
    }
}