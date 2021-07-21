import java.util.Arrays;

public class computeDepth_Final {

    public static void main(String[] args) {

        System.out.println(computeDepth(42));
        System.out.println(computeDepth(7));
        System.out.println(computeDepth(13));
        System.out.println(computeDepth(25));

    }

    public static int computeDepth(int n) {

        boolean[] flags = new boolean[10];

        for (int i = 0; i < 10; i++) flags[i] = false;

        int index = 1;
        while (true) {

            int product = n * index;

            // grab the last digit at a time and change the corrosponding flag in the flags array
            while (product > 0) {
                int remndr = product % 10;
                product /= 10;

                if (!flags[remndr]) {
                    flags[remndr] = true;
                }
            }

            boolean finalFlag = true;
            for (boolean aFlag : flags) {
                if (!aFlag)
                    finalFlag = false;
            }

            if (finalFlag) break;
            index++;
        }

        return index;
    }

}