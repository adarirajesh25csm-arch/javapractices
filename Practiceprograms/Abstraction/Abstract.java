package javacore;

abstract class Base{
	int x;
	
	void sayMyName() {
		System.out.println("My Name is Rajesh");
	}
	
	abstract void sayMyAge();
}

public class AbstractDemoSample extends Base{

	@Override
	void sayMyAge() {
		System.out.println("Age in Sub Class is 18");
	}

	public static void main(String[] args) {
		AbstractDemoSample ads = new AbstractDemoSample();
		System.out.println(ads.x);
		ads.sayMyName();
		ads.sayMyAge();
	}
}
