
import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial: ");
        int n = sc.nextInt();
        int factorial = 1; // explanation: Initialize factorial to 1 because the factorial of 0 is 1 and it serves as the multiplicative identity.
        for(int i = 0;i<n;i++)  {
            factorial = factorial *(i + 1); // explanation: Multiply factorial by (i + 1) to compute the factorial iteratively.

        }
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
    
}
