class A{
    int x=10;
    int y=20;
    void display(){
        System.out.println("this super class");
    }
    void zen(){
        System.out.println("this method is in class a but access through class b object");
    }
    void yvalue(){
        System.out.println(y);
    }
}
class B extends A{
    int x=9;
    void display(){
        System.out.println("this is super class");
    }
    void sum(){
        System.out.println(this.x+super.x);
    }
    void paly(){
        super.display();
    }
}
public class SingleInheritance {
    public static void main(String[] args) {

    B obj=new B();
    obj.paly();
    obj.zen();
    obj.sum();
    obj.display();
    obj.yvalue();;

    }



}
