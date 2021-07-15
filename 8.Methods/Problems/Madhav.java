public class Madhav{
    public static void main(String[] args){

        int result = isMadhavArray(new int[]{2, 1, 1});
        System.out.println(result);
        result = isMadhavArray(new int[]{2, 1, 1, 4, -1, -1});
        System.out.println(result);
        result = isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0});
        System.out.println(result);
        result = isMadhavArray(new int[]{18, 9, 10, 6, 6, 6});
        System.out.println(result);
        result = isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4});
        System.out.println(result);
        result = isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1});
        System.out.println(result);
        result = isMadhavArray(new int[]{3, 1, 2, 3, 0});
        System.out.println(result);

    }

    static int isMadhavArray(int[] listOfNumbers){

        int isMadhavArray = 0;  // let's say initially we believe the array is NOT Madhav Array
        int arrayLength = listOfNumbers.length;  // the whole length of our array

        /* THE CURRENT ARRAY :

        - refers to a small chunk of the big array being tested for Madhav conditions such as array[0] = array[1] + array[2]

        */

        int startIndex = 0; // start index of CURRENT ARRAY ELEMENTS under consideration
        int endIndex = 0; // end index of CURRENT ARRAY ELEMENTS under consideration

        int n = 1; // track current length of array elements between start and end index
        int currentSum = 0; // current sum of array elements
        int sum = 0; // sum of elements of array between startIndex and endIndex

        int currentLengthOfArray = 1; // length of array from index 0 to endIndex
        int calculatedLengthOfArray = 1; // length calculating n * (n+1)/2


        while(currentLengthOfArray <= arrayLength){

            if(currentLengthOfArray == calculatedLengthOfArray){
                for(int index = startIndex; index <= endIndex; index++){
                    sum += listOfNumbers[index];
                }
            }else{
                // Fail ::: The length of a Madhav array must be n*(n+1)/2 for some n
                isMadhavArray = 0;
                break;
            }

            if((currentSum == sum) || (startIndex == endIndex)){ // startIndex == endIndex to satisfy initial condition
                currentSum = sum;
                sum = 0;
                isMadhavArray = 1;
            }else{
                // Fail ::: The sum is not equal
                isMadhavArray = 0;
                break;
            }
            if(currentLengthOfArray == arrayLength){
                // already at the end of the array
                break;
            }else{
                startIndex = endIndex + 1;
                endIndex = startIndex + n;
                if((startIndex < arrayLength && endIndex < arrayLength)){
                    // operating inside the array bounderies
                    n++;
                }else{
                    // adjusting boundries; so that lastIndex points last element of array
                    endIndex = arrayLength - 1;
                    n = endIndex - startIndex;
                }
                calculatedLengthOfArray = n * (n + 1)/2;
                currentLengthOfArray = endIndex + 1;
            }
        }
        return isMadhavArray;
    }
}