import java.util.Arrays;

public class isInertial{
	public static void main(String[] args){

		int result = isInertial(new int[]{11, 4, 20, 9, 2, 8});
		System.out.println(result);

	}

	static int isInertial(int[] a){
		int isInertial = 0;
		boolean containsOddValue = false;
		int maxValue = Integer.MIN_VALUE;
		int[] oddValues = new int[a.length];
		int[] evenValues = new int[a.length];
		int oddValuesIndex = 0;
		int evenValuesIndex = 0;

		for(int index = 0; index < a.length; index++){
			if((a[index] % 2) != 0){
				containsOddValue = true;
				oddValues[oddValuesIndex] = a[index];
				oddValuesIndex++;
			}else{
				evenValues[evenValuesIndex] = a[index];
				evenValuesIndex++;
			}

			// find the maximum value
			if(a[index] > maxValue){
				maxValue = a[index];
			}
		}

		// check inertial properties 1. has odd value , 2. max value is even and 3 . odds are grater except the max

		// 1. has at least one odd
		if(containsOddValue){

			// 2. Max is even
			if(maxValue % 2 == 0){

				for(int oddIndex = 0; oddIndex < oddValuesIndex; oddIndex++){
					for(int evenIndex = 0; evenIndex < evenValuesIndex; evenIndex++){
						if(evenValues[evenIndex] != maxValue){
							if(oddValues[oddIndex] > evenValues[evenIndex]){
								isInertial = 1;
							}else{
								isInertial = 0;
								break;
							}

						}else{
							isInertial = 1;
						}
					}
					if(isInertial == 0){
						break;
					}
				}
			}
		}

		System.out.println("Odd values : "+ Arrays.toString(oddValues));
		System.out.println(" Even values : "+Arrays.toString(evenValues));

		System.out.println(" Odd values index : "+oddValuesIndex);
		System.out.println(" Even values index : "+evenValuesIndex);

		return isInertial;
	}
}