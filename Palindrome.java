
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int num = sc.nextInt();

        int Original = num;
        int Reversed = 0;

        while (num != 0) { 
            int digit = num % 10;
            Reversed = Reversed * 10 + digit;
            num /= 10;
        }

        if (Original == Reversed) {
            System.out.println(Original + " is a palindrome.");
        } else {
            System.out.println(Original + " is not a palindrome.");
        }
    }
    
}
