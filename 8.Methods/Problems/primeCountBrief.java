public class primeCountBrief{

	// main method
	public static void main(String[] args){
		int result = primeCount(10, 30);
		System.out.println(result);

	}


	// counter method
	public static int primeCount(int start, int end){
		int primeCount = 0;

		for(int number = start; number <= end; number++){
			if(number > 1){
				boolean isPrime = true;
				for(int divider = 2; divider * 2 <= number; divider++){
					if(number % divider == 0){

						System.out.println("divider is : "+divider+" for a number "+number);
						isPrime = false;
						break;
					}
				}
				if(isPrime){
					primeCount++;
				}
			}
		}

		return primeCount;
	}





}