
interface Printable {                      // Interface 1
    void print();
}

interface Showable {                        // Interface 2

    void show();
}

class Document implements Printable, Showable {                 // Implementing both interfaces

    public void print() {
        System.out.println("Printing document...");
    }
    
    public void show() {
        System.out.println("Showing document...");
    }
}

public class MultipleInheritance {                                // Main class to test multiple inheritance using interfaces

    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}
