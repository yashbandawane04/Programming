import java.util.Scanner;

// 1. Single Inheritance
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Car inherits Vehicle
class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

// 2. Multilevel Inheritance
class FourWheeler extends Vehicle {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}

class SportsCar extends FourWheeler {
    SportsCar() {
        System.out.println("This 4 Wheeler Vehicle is a Sports Car");
    }
}

// 3. Hierarchical Inheritance
class Bus extends Vehicle {
    Bus() {
        System.out.println("This Vehicle is Bus");
    }
}


// 4. Exception Handling
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}


public class Main {
    public static void main(String[] args) {

        // ----- Single Inheritance -----
        System.out.println("1. Single Inheritance:");
        Car obj1 = new Car();

        System.out.println();


        // ----- Multilevel Inheritance -----
        System.out.println("2. Multilevel Inheritance:");
        SportsCar obj2 = new SportsCar();

        System.out.println();


        // ----- Hierarchical Inheritance -----
        System.out.println("3. Hierarchical Inheritance:");

        Car obj3 = new Car();
        Bus obj4 = new Bus();

        System.out.println();


        // ----- Exception Handling -----
        System.out.println("4. Exception Handling:");

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 0) {
                throw new InvalidAgeException(
                    "Age cannot be negative!"
                );
            } 
            else if (age < 18) {
                throw new InvalidAgeException(
                    "You must be 18 or above to vote."
                );
            }

            System.out.println("You are eligible to vote.");

        } 
        catch (InvalidAgeException ie) {
            System.out.println("Error: " + ie.getMessage());
        } 
        catch (Exception e) {
            System.out.println(
                "Invalid input! Please enter a valid number."
            );
        } 
        finally {
            System.out.println("Thank you for using the system.");
            sc.close();
        }
    }
}