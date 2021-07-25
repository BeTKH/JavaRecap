public class RailRoadTie {

    public static void main(String[] args) {


        System.out.println(isRailroadTie(new int[]{1, 2}));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));
        System.out.println(isRailroadTie(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3}));
        System.out.println(isRailroadTie(new int[]{0, 0, 0, 0}));
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isRailroadTie(new int[]{1, 3, 0, 3, 5, 0}));

    }

    public static int isRailroadTie( int[] list){

        // quick check
        if (list.length <= 1 || list[0] == 0 || list[(list.length - 1)] == 0)
            return 0;

        // check other cases the list fails tobecome a railroadtie
        for (int i = 1; i < list.length - 1; i++) {

            // a zero element having two non-zero neighbours or both neighbours zero doesn't meet the req --> return 0
            if (list[i] != 0 && ((list[i + 1] != 0 && list[i - 1] != 0) || (list[i + 1] == 0 && list[i - 1] == 0))) {
                return 0;

                // if a zero element has both its neighbours zero , also doesn't meet the req
            } else if (list[i] == 0 && (list[i - 1] == 0 || list[i + 1] == 0)) {
                return 0;
            }

        }

        // otherwise its a railroad tie
        return 1;

    }
}