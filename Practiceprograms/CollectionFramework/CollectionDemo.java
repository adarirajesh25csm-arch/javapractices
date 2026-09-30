import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Collection: " + fruits);

        System.out.println("Size: " + fruits.size());

        System.out.println("Contains Apple: " + fruits.contains("Apple"));

        fruits.remove("Banana");

        System.out.println("After removing Banana: " + fruits);

        System.out.println("Is Empty: " + fruits.isEmpty());

        fruits.clear();

        System.out.println("After clear: " + fruits);

        System.out.println("Is Empty: " + fruits.isEmpty());
    }
}
