package firstprogram;

class A{
	int x = 10;
	
	void add() {
		System.out.println("Add from class A is : " + (x*2));
		
	}
}

class B extends A {
	 int y = 20;
	 
	 void sub() {
		 System.out.println("sub from class B is : " + (y-5));
		 
}
	 void add() {
		 int l = 2,m = 3,n =7;
		 System.out.println("Add from class B is : " + (l+m+n));
		 
	 }
	 
}
public class SingleInheritance {
    public static void main() {
    	B obj = new B();
    	System.out.println("Variable is :" + obj.x);
    	obj.add();
    	obj.sub();
    	
    }
}
