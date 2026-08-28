package exceptionhandling;

public class TrywithMultiplecatch {
	
	public static void main(String[] args) {
		
		int a = 100;
		int b = 0;
		
		
	try {	
		int c = a/b;  // Arithmetic Exception
		
		System.out.println("Value of C: " +c );
		
		int g[] = {10,20,30};
		  
		System.out.println("Index of 2: " +g[5]); // ArrayIndexOutOfBounds Exception

		
	}catch(ArithmeticException ae) { 
		
		System.out.println("It can execute only if you give non ZERO numbers");
	}
		
	catch(ArrayIndexOutOfBoundsException aioob) {
		
		System.out.println("The Array Index Is Out Of Bounds");
	}
		System.out.println("Program Executes Sucessfully");
		
	}

}
