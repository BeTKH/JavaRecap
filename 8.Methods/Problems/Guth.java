public class Guth {

    public static void main(String[] args) {

        int result = isGuthSeq(new int[] {8, 4, 2, 1});
        System.out.println(result);
        result = isGuthSeq(new int[] {8, 17, 4, 1});
        System.out.println(result);
        result = isGuthSeq(new int[] {8, 4, 1});
        System.out.println(result);
        result = isGuthSeq(new int[] {8, 4, 2});
        System.out.println(result);

        result = isGuthSeq(new int[] {7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1});
        System.out.println(result);

    }


    // the method
    public static int isGuthSeq(int[] list){

        int isGuthrieSequence = 0;         // set a flag --> assume initially the seq is not guth
        int nextSequenceNumber = list[0];  // the first value of the Guth sequence

        if(list[list.length - 1] == 1){    // the last element of the Guth seq has to be 1 , else the if body is skipped and the flag above is unchanged

            for(int index = 0; index < list.length; index++){

                if(nextSequenceNumber == list[index]){ // if the sequences match its guth
                    isGuthrieSequence = 1;

                    // calculate the next values --> if even divide by 2 , if odd *3 then add 1

                    if(list[index] % 2 == 0 ){
                        nextSequenceNumber = list[index] / 2;
                    }else{
                        nextSequenceNumber = list[index] * 3 + 1;
                    }
                }else{                            // if the sequences DO NOT match its NOT guth
                    isGuthrieSequence = 0;
                    //break;
                }
            }
        }
        return isGuthrieSequence;
    }
}