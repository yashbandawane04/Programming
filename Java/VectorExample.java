import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Inserting elements into the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");
        vector.add("Elderberry");

        // Displaying elements of the Vector
        System.out.println("Elements in the Vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }
    }
}
