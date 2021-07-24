import java.util.Arrays;

public class ClusterCompression {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(clusterCompression(new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{18})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{-5, -5, -5, -5, -5})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2})));
    }

    static int[] clusterCompression(int[] list) {
        if (list.length == 0) {
            return new int[]{};
        }

        int numClusters = 1;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != list[i + 1]) {
                numClusters++;
            }
        }

        int[] result = new int[numClusters];

        if (numClusters == 1) {
            result[0] = list[0];
            return result;
        }

        int clusterIndex = 0;

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != list[i + 1]) {
                result[clusterIndex] = list[i];
                result[clusterIndex + 1] = list[i + 1];
                clusterIndex++;
            }
        }

        return result;
    }
}
