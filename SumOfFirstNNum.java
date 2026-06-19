
import java.util.Scanner;

public class SumOfFirstNNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last Number to sum up to 1: ");
        int n = sc.nextInt();
        int Sum = 0;

        for(int i = 0; i <= n; i++) {
            Sum += i;
        }
        System.out.println("The sum of the first " + n + " numbers is: " + Sum);
    }

}
