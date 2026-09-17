// C1 extends C2
// C1 inherits the members of C2.

class C2 {
    void displayC2() {
        System.out.println("Method of C2");
    }
}

class C1 extends C2 {
    void displayC1() {
        System.out.println("Method of C1");
    }
}

public class Case1 {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.displayC2();
        obj.displayC1();
    }
}
