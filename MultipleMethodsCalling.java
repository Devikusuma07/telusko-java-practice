class MathOperations {

    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int square(int n) {
        return n * n;
    }

    void calculate(int x, int y) {

        int sum = add(x, y);          // Calling add()
        int product = multiply(x, y); // Calling multiply()
        int squareX = square(x);      // Calling square()

        System.out.println("Addition: " + sum);
        System.out.println("Multiplication: " + product);
        System.out.println("Square of " + x + ": " + squareX);
    }
}
public class MultipleMethodsCalling {
    public static void main(String[] args) {

        MathOperations obj = new MathOperations();

        obj.calculate(5, 3);   // Only one method call
    }
    
}
