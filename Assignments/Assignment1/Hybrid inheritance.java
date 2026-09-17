// Hybrid Inheritance:
// Hybrid inheritance is a combination of two or more
// types of inheritance.
//
// Here, hierarchical inheritance is combined with
// multiple inheritance through interfaces.

class Person {
    void identity() {
        System.out.println("This is a person.");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student studies.");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher teaches.");
    }
}

interface Sports {
    void playSports();
}

interface Cultural {
    void culturalActivity();
}

// Student -> Person represents multilevel inheritance.
// SportsStudent also implements two interfaces,
// demonstrating multiple inheritance through interfaces.
class SportsStudent extends Student implements Sports, Cultural {

    public void playSports() {
        System.out.println("Student plays sports.");
    }

    public void culturalActivity() {
        System.out.println("Student participates in cultural activities.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        SportsStudent s = new SportsStudent();

        s.identity();          // From Person
        s.study();             // From Student
        s.playSports();        // From Sports
        s.culturalActivity();  // From Cultural
    }
}
