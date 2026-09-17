// Single Inheritance:
// One child class inherits from one parent class.

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

public class SingleInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // Method inherited from Animal
        d.bark();  // Method of Dog
    }
}
