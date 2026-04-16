
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt(); 
        int num[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for(int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

}
