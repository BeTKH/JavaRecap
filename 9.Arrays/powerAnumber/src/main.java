public class main {

    public static void main(String[] args) {

        findPower(5,3);

    }


    public static void findPower(int value, int exponent){

        int result = 0;

        for (int i = 0 ; i < exponent -1 ; i++){

            result += value * value;

        }

        System.out.println(result);
    }
}
