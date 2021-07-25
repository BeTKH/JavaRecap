public class FullnessQuotient {

    public static void main(String[] args) {

        System.out.println(fullnessQuotient(94));
        System.out.println(fullnessQuotient(1));
        System.out.println(fullnessQuotient(9));
        System.out.println(fullnessQuotient(360));
        System.out.println(fullnessQuotient(-4));

    }

    public static int fullnessQuotient( int n){

        //quick check
        if (n < 1)
            return -1;

        // count the instances where the base 2 -9 representation has no 0 in it
        int count = 0;
        for (int base = 2; base <= 9; base++) {
            boolean zeroFlag = false;
            for (int num = n; num > 0; num /= base) {
                if (num % base == 0) {
                    zeroFlag = true;
                    break;
                }
            }
            if (!zeroFlag)
                count++;
        }

        // return the fullness quotient ...count
        return count;
    }
}