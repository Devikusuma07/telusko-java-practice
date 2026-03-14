import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int num = sc.nextInt();

        int Original = num;
        int sum = 0;

        while (num != 0) { 
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (Original == sum) {
            System.out.println(Original + " is an Armstrong number.");
        } else {
            System.out.println(Original + " is not an Armstrong number."); 
        }
    }

}
        
    
