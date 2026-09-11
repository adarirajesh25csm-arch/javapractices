package string.operations;

public class  CharAt {
	
	public static void main(String[] args) {
		String name = "Hello Boss!";             // Creating a String
		String s1 = new String("Hello BhAAi");   // Creating a String
		
        System.out.println(name.length());
        System.out.println(s1.length());
        
        System.out.println(name.charAt(4));  // particular character at a string
        System.out.println(s1.charAt(7));   //  particular character at a string
		
	}

}
