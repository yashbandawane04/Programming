class Calculator {

    // Method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with 2 double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum (int, int): " + calc.add(10, 20));

        System.out.println("Sum (int, int, int): " + calc.add(10, 20, 30));

        System.out.println("Sum (double, double): " + calc.add(10.5, 20.5));
    }
}