
import java.util.Scanner;

// using if-else
public class SimpleCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Operattion (+, -, *, /):");
        char op = sc.next().charAt(0);
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        if (op == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (op == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (op == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (op == '/') {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Error: Invalid operator.");
        }

        sc.close(); // We need to close the scanner to free up system resources and avoid memory leaks.
    }
}
