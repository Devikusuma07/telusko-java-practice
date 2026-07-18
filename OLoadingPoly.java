class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double  a, double  b) {
        return a + b;
    }
}

public class OLoadingPoly {
    public static void main(String[] args) {
        System.out.println("Overloading polymorphism");
        Calculator c = new Calculator();
        int c1 = c.add(2,3);
        double c2 = c.add(2.4, 5.4);
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
    }
    
}
