public class SequentiallyBounded {

    public static void main(String[] args) {

        System.out.println(isSequentiallyBounded(new int[]{0, 1}));
        System.out.println(isSequentiallyBounded(new int[]{-1, 2}));
        System.out.println(isSequentiallyBounded(new int[]{}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 2, 5}));
        System.out.println();
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99}));
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 3, 3}));
        System.out.println(isSequentiallyBounded(new int[]{12, 12, 9}));
        System.out.println(isSequentiallyBounded(new int[]{0}));
    }

    public static int isSequentiallyBounded(int[] list) {
        int countSequence = 1;

        // case : array contains only one element and it is <= 0 --> SeqNot Bounded
        if (list.length == 1 && list[0] <= 0)
            return 0;

        for (int i = 0; i < list.length - 1; i++) {

            // check if the arry is in ascending order --- if NOT , then NOT seq Bounded
            if (list[i] > list[i + 1])
                return 0;

            // count the instance where the next val equals the prev value
            if (list[i] == list[i + 1])
                countSequence++;
            else
                countSequence = 1;

            // if the number occurs more than its value --> NOTseq bounded
            if (list[i] <= countSequence)
                return 0;
        }
        return 1;
    }

}
