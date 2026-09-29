class Student {

    int id;
    String name;

    // Default constructor
    Student() {
        id = 0;
        name = "Unknown";
    }

    // Parameterized constructor with 1 parameter
    Student(int id) {
        this.id = id;
        name = "Not Specified";
    }

    // Parameterized constructor with 2 parameters
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(101);
        Student s3 = new Student(102, "Amit");

        s1.display();
        s2.display();
        s3.display();
    }
}