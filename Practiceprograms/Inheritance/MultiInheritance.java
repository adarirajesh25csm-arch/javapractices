package javacore;

interface I1{
	int x = 100;
	
	void sample();
}
interface I2 extends I1 {
	int y = 200;
	
	void demo();
}

class Multi implements I1,I2{

	@Override
	public void demo() {
		System.out.println("I2 Implement from sub class");
		
	}

	@Override
	public void sample() {
		System.out.println("I1 Implement from Super class");
		
	}
	
}
public class ImplementMultiInheritance {
  public static void main(String[] args) {
	  Multi m = new Multi();
	  
	  System.out.println(I2.x);
	  System.out.println(m.y);
	  m.demo();
	  m.demo();
	  
  }
}
