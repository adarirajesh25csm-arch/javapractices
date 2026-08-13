class A{Hierarchical
    int x=10;
    int y=30;
    void sum(){
        System.out.println("sum is "+(x+y));
    }
}
class B extends A{
    void display(){
        System.err.println("this one sub clss");
    }
    void con(){
        System.out.println(x);
    }
}
class C extends A{
    void play(){
        System.out.println("this is second sub class");
    }
    void show(){
        System.out.println(y);
    }
}
public class Hierarchical {

    public static void main(String[] args) {
        C obj=new C();
        B Obj1=new B();
        obj.sum();
        Obj1.sum();
        obj.play();
    }
}
