public class primeCountBrief{
	public static void main(String[] args){
		int result = primeCount(10, 30);
		System.out.println(result);

	}

	static int primeCount(int start, int end){
		int primeCount = 0;
		for(int number = start; number <= end; number++){
			if(number > 1){	
				boolean isPrime = true;
				for(int divider = 2; divider * 2 <= number; divider++){
					if(number % divider == 0){
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