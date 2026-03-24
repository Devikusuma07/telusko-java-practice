
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();

        int count = 0; // explanation: Initialize count to 0 to keep track of the number of digits.
        if(n == 0) {
            count = 1;
        } else {
           while(n != 0) {
            n = n / 10;
            count++;
           }

        } 
        System.out.println("The number of digits is: " + count);
    }
    
}
