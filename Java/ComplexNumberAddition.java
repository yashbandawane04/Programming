class Complex {
    int real, imag;

    // Default Constructor
    Complex() {
        real = 0;
        imag = 0;
    }

    // Parameterized Constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Copy Constructor
    Complex(Complex c) {
        real = c.real;
        imag = c.imag;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        Complex temp = new Complex();
        temp.real = this.real + c.real;
        temp.imag = this.imag + c.imag;
        return temp;
    }

    // Method to display complex number
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexNumberAddition {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4); // Using parameterized constructor
        Complex c2 = new Complex(1, 2); // Using parameterized constructor
        Complex c3 = c1.add(c2);        // Adding two complex numbers

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        System.out.print("Sum of Complex Numbers: ");
        c3.display();
    }
}
