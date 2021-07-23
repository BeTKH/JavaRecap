import java.util.HashSet;

public class isTrivalent {

    public static void main(String[] args) {

        System.out.println(isTriv(new int[] {22, 19, 10, 10, 19, 22, 22, 10}));
        System.out.println(isTriv(new int[] {1, 2, 2, 2, 2, 2, 2}));
        System.out.println(isTriv(new int[] {2, 2, 3, 3, 3, 3, 2, 41, 65}));
        System.out.println(isTriv(new int[] {-1, 0, 1, 0, 0, 0}));
        System.out.println(isTriv(new int[] {}));
        System.out.println(isTriv(new int[] { 2147483647, -1, -1 , -2147483648}));
    }


    public static int isTriv( int[] list){

        // count distinct numbers using hashing
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0 ; i < list.length ; i++){
            hs.add(list[i]);
        }

        if (hs.size() == 3){
            return 1;
        }else{
            return 0;
        }

    }
}