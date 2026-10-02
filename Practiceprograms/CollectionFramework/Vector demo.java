import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

        // 1. add()
        names.add("Rajesh");
        names.add("Ravi");
        names.add("Kiran");

        System.out.println("Original Vector: " + names);

        // 2. add(index, element)
        names.add(1, "Suresh");

        System.out.println("After adding at index 1: " + names);

        // 3. get()
        System.out.println("Element at index 2: " + names.get(2));

        // 4. set()
        names.set(2, "Arjun");

        System.out.println("After set(): " + names);

        // 5. contains()
        System.out.println("Contains Rajesh: " + names.contains("Rajesh"));

        // 6. remove()
        names.remove("Kiran");

        System.out.println("After removing Kiran: " + names);

        // 7. size()
        System.out.println("Size: " + names.size());
    }
}
