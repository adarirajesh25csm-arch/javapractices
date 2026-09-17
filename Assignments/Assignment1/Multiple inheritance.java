// Multiple Inheritance:
// Java does not support multiple inheritance using classes.
// It can be achieved using multiple interfaces.
//
// Here, Student implements both Printable and Showable.

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Student implements Printable, Showable {

    public void print() {
        System.out.println("Student print method.");
    }

    public void show() {
        System.out.println("Student show method.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Student s = new Student();

        s.print();
        s.show();
    }
}
