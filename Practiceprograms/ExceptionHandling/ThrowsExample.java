package exceptionhandling;

public class ThrowsExample {
	
	static void checkAge(int age) throws Exception {
		
		if(age<18) {
			
		throw new Exception("Acess Denied:Your are not eligible");
			
		}else {
			System.out.println("Acess Granted:Your are eligible");
		}
	}
	public static void main(String[] args) {
		
		
			
				try {
					checkAge(12);
				} catch (Exception e) {
					
	        System.out.println("error occured");
	        System.out.println(e.getMessage());
				}
			System.out.println("Program Runs Smoothly...");
	}

}
