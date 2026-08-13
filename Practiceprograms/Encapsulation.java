package javacore;

class Demo{
   int a;
   float b;
   char c;
   String s;

public int getA() {
	return a;

}
public void setA(int a) {
	this.a = a;
	
}
public float getB() {
	return b;
	
}
public void setB(float b) {
	this.b = b;
	
}
public char getC() {
	return c;
	
}
public void setC(char c) {
	this.c = c;
}
public String getS() {
	return s;
}
public void setS(String s) {
	this.s = s;
	
}
}
public class Encapsulation{
	public static void main(String[] args) {
		Demo d = new  Demo();
		d.setA(5000);
		System.out.println(d.getA());   
		
		d.setB(3.345f);
		System.out.println(d.getB());
		
		
	}
	
}  
