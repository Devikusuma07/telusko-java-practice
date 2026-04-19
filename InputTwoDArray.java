
import java.util.Scanner;

public class InputTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt();
        int[][] num = new int[m][n];

        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i<m;i++){
            for(int j=0; j<n; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of the array are : ");
        for (int i = 0; i < m; i++) {
            for(int j = 0; j<n; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
