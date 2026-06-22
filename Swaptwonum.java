public class Swaptwonum {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        //swapping logic
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        // Without using third variable
         a = a + b;
         b = a - b;
         a = a - b;

        System.out.println("After swapping without third variable: a = " + a + ", b = " + b);

    }
    
}
