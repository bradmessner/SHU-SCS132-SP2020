// Comment

public class recur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Call initial recursion method
		cups(40);
		System.out.println("\n\n");
		
		// Recursion Example
		int fibonacciNumber = fibonacci(10);
		System.out.println(fibonacciNumber);
		System.out.println("\n\n");
		
		// Non Rec / For Loop Example
		System.out.println(fibnonrec(10));

	}

	

	public static int cups(int c)
	{
		//System.out.println(c + " cups of tea in Brad's office.");
		if(c==0)
			return 0;
		else
		{
			System.out.println("Take one out, drink it down. " + (c-1) + " cups of tea in Brad's office.");
			return cups(c-1); 
		}
	}
	
	
	
	
	
	
	
	public static int fibonacci(int n) {
	    
		// B...a...s...e...C...a...s...e.... 
		if (n <= 1) {
	        return n;   }
	    System.out.println(n);
	    return fibonacci(n-1) + fibonacci(n-2);
	}
	
	
	
	public static int fibnonrec(int number) {
	
		if (number<=1)
				return number;
		
		int currentNum = 1;
		int prevNum = 1;
		
		for (int i = 2; i<number; i++) {
			int temp = currentNum;
			currentNum += prevNum;
			prevNum= temp;
			System.out.println(currentNum);
		}
		return currentNum;
	
	}

}
