public class isStacked {

    public static void main(String[] args) {

        System.out.println(isStackd(1));
        System.out.println(isStackd(3));
        System.out.println(isStackd(6));
        System.out.println(isStackd(10));
        System.out.println(isStackd(15));
        System.out.println(isStackd(7));
        System.out.println(isStackd(8));
        System.out.println(isStackd(9));

    }

    public static int isStackd( int n){
        int stack = 0 ;
        int isStackedNum = 0;
        for (int i = 1 ; i <= n ; i++){
            //System.out.println(i);
            stack += i;
            //System.out.println(stack);

            if (stack == n){
                isStackedNum = 1;
            }

            }

        return isStackedNum;
        }
    }
