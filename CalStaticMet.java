class Calculator {
    
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a , int b) {
        return a * b;
    }
}

public class CalStaticMet {
    public static void main(String[] args) {
        System.out.println("Addition: " + Calculator.add(10, 60));
        System.out.println("Subtraction: " + Calculator.sub(30, 60));
        System.out.println("Multiplication: " +Calculator.mul(90, 90));
    }
    
}
