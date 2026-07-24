public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "  Java Programming  ";

        // Length of String
        System.out.println("Length: " + str.length());

        // Character at a specific index
        System.out.println("Char at 4: " + str.charAt(4));

        // Substring
        System.out.println("Substring(0, 5): " + str.substring(0, 5));

        // Concatenation
        System.out.println("Concatenate: " + str.concat("!!!"));

        // Index of character
        System.out.println("Index of 'o': " + str.indexOf('o'));

        // Last index of character
        System.out.println("Last Index of 'o': " + str.lastIndexOf('o'));

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Trim whitespace
        System.out.println("Trimmed: '" + str2.trim() + "'");

        // Replace characters
        System.out.println("Replace 'l' with 'p': " + str.replace('l', 'p'));

        // Check equality
        System.out.println("Equals 'Hello World': " + str.equals("Hello World"));

        // Compare to another string
        System.out.println("Compare to 'Hello': " + str.compareTo("Hello"));

        // Check if empty
        System.out.println("Is Empty: " + str.isEmpty());

        // Split string
        String[] words = str.split(" ");
        System.out.print("Split: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
