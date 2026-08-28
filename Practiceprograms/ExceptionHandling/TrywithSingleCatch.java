package exceptionhandling;

public class TrywithSingleCatch{
	public static void main(String[] args) {
		
		int i = 100,j = 0;
		
		try {
			
		int k = i/j;
		
		System.out.println("Value of k: " +k );
		
		}catch(ArithmeticException ae) {
			
		 System.out.println("It can excute only if you give non zero numbers");
		 
		}
		
		System.out.println("Without Exception Handling");
		
		System.out.println("With Exception Handling");
	}

}
