class A{
    int x=10;
    int y=20;
    void sum(){
        System.out.println("sum is "+(x+y));
    }
}
class B extends A{
    int y=30;
    void display(){
        System.out.println("this from class b");
    }
    void play(){
        System.out.println("value of x from class a "+x);
    }
}
class c extends B {
    void show(){
        System.out.println("value of y from class b is"+y);
    }

}
public class MultilevelInheritance {

    public static void main(String[] args) {
        c obj=new c();
        obj.show();
        obj.play();
        obj.display();
        obj.sum();
    }
}
