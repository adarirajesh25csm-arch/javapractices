// Multilevel Inheritance:
// A class inherits from another class,
// and a third class inherits from the second class.

class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();   // From Animal
        p.bark();  // From Dog
        p.play();  // From Puppy
    }
}
