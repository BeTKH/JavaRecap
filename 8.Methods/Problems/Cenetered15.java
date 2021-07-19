public class Cenetered15 {

    // main
    public static void main(String[] args) {

        System.out.println(isCenetered(new int[] {3, 2, 10, 4, 1, 6, 9}));
        System.out.println(isCenetered(new int[] {2, 10, 4, 1, 6, 9}));
        System.out.println(isCenetered(new int[] {3, 2, 10, 4, 1, 6}));
        System.out.println(isCenetered(new int[] {1,1,8, 3, 1, 1}));
        System.out.println(isCenetered(new int[] {9, 15, 6}));
        System.out.println(isCenetered(new int[] {1, 1, 2, 2, 1, 1}));
        System.out.println(isCenetered(new int[] {1, 1, 15 -1,-1}));
        System.out.println(isCenetered(new int[] {1, 12, 1, 1,1, 1}));

    }



    // the method
    public static int isCenetered( int[] list){

        int isCentered15 = 0;
        int lowerIndex = 0;
        int upperIndex = 0;
        int sum = 0;

        // calculate the lower and upper indices (indexes)
        if(list.length % 2 == 0){                       // {2, 10, 4, 1, 6, 9} --> {2, 10, <---  4, --->  1, 6, 9}   upper 3 and lower 2
            lowerIndex = (list.length / 2) - 1;
            upperIndex = list.length / 2 ;
        }else{
            lowerIndex = (list.length - 1) / 2;        // {3, 2, 10, 4, 1, 6, 9} --> {3, 2, 10,  <---4, ---> 1, 6, 9} lower 3 , upper 3
            upperIndex = lowerIndex;
        }


        while(lowerIndex >= 0 && upperIndex < list.length){
            sum = 0;
            for(int index = lowerIndex; index <= upperIndex; index++){
                sum += list[index];
            }
            if(sum == 15){
                isCentered15 = 1;
                break;
            }
            lowerIndex--;
            upperIndex++;
        }
        return isCentered15;

    }

}