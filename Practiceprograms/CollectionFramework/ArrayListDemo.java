import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // 1. add()
        names.add("Rajesh");
        names.add("Ravi");
        names.add("Kiran");

        System.out.println("Original List: " + names);

        // 2. add(index, element)
        names.add(1, "Suresh");

        System.out.println("After adding at index 1: " + names);

        // 3. get()
        System.out.println("Element at index 2: " + names.get(2));

        // 4. set()
        names.set(2, "Arjun");

        System.out.println("After set(): " + names);

        // 5. remove()
        names.remove("Kiran");

        System.out.println("After removing Kiran: " + names);

        // 6. contains()
        System.out.println("Contains Rajesh: " + names.contains("Rajesh"));

        // 7. size()
        System.out.println("Size: " + names.size());

        // 8. isEmpty()
        System.out.println("Is Empty: " + names.isEmpty());

        // 9. clear()
        names.clear();

        System.out.println("After clear(): " + names);

        System.out.println("Is Empty: " + names.isEmpty());
    }
}
