package firstprogram;

public class HelloWorld {
	
	
     int a = 100;           // instance variable or class variable
     float b = 10000.289f;
     String c = "rajesh";
     
     
     public HelloWorld() {
    	 
    	 System.out.println("Well done");
     }
       
   void sample(){
	   
	   System.out.println("How are you Bro");
	   System.out.println(+a);
	   System.out.println(+b);
	   System.out.println(c);
	  
  }
	  
  
     
     
	public static void main(String[] args) {
		
		System.out.println("hello world");
		
		HelloWorld hw = new HelloWorld();
		hw.sample();
		
		
	}
	
	
}
