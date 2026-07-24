
class Animal {                                         // Base class
    void eat() {
        System.out.println("Eating...");
    }
}


class Dog extends Animal {                              // Derived class
    void bark() {
        System.out.println("Barking...");
    }
}


public class SingleInheritance {                       // Main class to test single inheritance
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited method
        d.bark(); // Class-specific method
    }
}
