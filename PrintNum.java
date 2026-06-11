import java.util.Scanner;
public class PrintNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number to print from 1: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println(" \n" + i);
        }

        
    }
    
}
