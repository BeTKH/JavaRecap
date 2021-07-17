public class solve10{
	public static void main(String[] args){
		int[] result = solve10();
		for(int number : result){
			System.out.println(number);
		}
	}

	static int[] solve10(){

		int solve10[] = new int[2]; // create array of size two
		int tenFactorial = 1;
		int x = 0;
		int y = 0;
		boolean factorialFound = false;

		// calculate 10!   = 10 * 9 * ...* 2 * 1
		for(int i = 1; i <= 10; i++){
			tenFactorial = tenFactorial * i;
		}

		for(x = 0; x < 10; x++){  // X is any number between 0 - 9

			int xFactorial = 1;

			if(x > 0){
				for(int i = 1; i <= x; i++){
					xFactorial = xFactorial * i;
				}
			}

			for(y = 0; y < 10; y++){  // Y is also any number between 0 - 9

				int yFactorial = 1;
				if(y > 0){	
					for(int j = 1; j <= y; j++){
						yFactorial = yFactorial * j;
					}
				}
				if(xFactorial + yFactorial == tenFactorial){
					factorialFound = true;
					break;
				}
			}

			// break out of the loop when the factorial is found
			if(factorialFound){

				System.out.println("Factorail is found");
				break;
			}

		}

		// if x and y are not found ... after searching all the way to 10 ... reset the values
		if(x == 10 && y == 10){
			//Not Found
			x = 0;
			y = 0;
		}

		// store the values into the arry
		solve10[0] = x;
		solve10[1] = y;
		return solve10;
	}
}