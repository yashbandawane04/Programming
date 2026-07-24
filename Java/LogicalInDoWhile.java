import java.util.Scanner;

public class LogicalInDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print("Enter a positive even number (0 to exit): ");
            number = scanner.nextInt();

            if (number != 0 && number % 2 != 0) {
                System.out.println("Invalid input! Please enter an even number.");
            }
        } while (number != 0 && number % 2 != 0);

        System.out.println("You entered: " + number);
        scanner.close();
    }
}
