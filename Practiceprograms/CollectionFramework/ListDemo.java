import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Rajesh");
        names.add("Ravi");
        names.add("Kiran");
        names.add("Rajesh");

        System.out.println("List: " + names);

        System.out.println("First element: " + names.get(0));

        System.out.println("Size: " + names.size());

        System.out.println("Contains Ravi: " + names.contains("Ravi"));

        names.remove("Kiran");

        System.out.println("After removing Kiran: " + names);
      
        names.set(2, "Praveen");
      
        System.out.println("After updating: "+ names);
    }
}
