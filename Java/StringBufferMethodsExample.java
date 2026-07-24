public class StringBufferMethodsExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Append method
        sb.append(" World");
        System.out.println("Append: " + sb);

        // Insert method
        sb.insert(5, " Java");
        System.out.println("Insert: " + sb);

        // Replace method
        sb.replace(6, 10, "C++");
        System.out.println("Replace: " + sb);

        // Delete method
        sb.delete(6, 9);
        System.out.println("Delete: " + sb);

        // Reverse method
        sb.reverse();
        System.out.println("Reverse: " + sb);
        sb.reverse(); // Reversing back to original

        // Capacity of buffer
        System.out.println("Capacity: " + sb.capacity());

        // Length of string
        System.out.println("Length: " + sb.length());

        // Char at index
        System.out.println("Char at 4: " + sb.charAt(4));

        // Set character at index
        sb.setCharAt(4, 'X');
        System.out.println("Set Char at 4: " + sb);

        // Substring
        System.out.println("Substring(0, 5): " + sb.substring(0, 5));
    }
}
