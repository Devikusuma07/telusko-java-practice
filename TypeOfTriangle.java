
import java.util.Scanner;

public class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lengths of the three sides of the triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && b == c && a == c) {
            System.out.println("The triangle is Equilateral.");
        } 
        else if(a == b && b != c || b == c && c != a || a == c && a!= b) {
            System.out.println("The triangle is Isosceles.");
        } 
        else if( a != b &&  b != c && c != a) {
            System.out.println("The triangle is Scalene.");
        } 
        else {
            System.out.println("Not a valid triangle.");
        }

    }
    
}
