class Factorial {

    int n;
    public int factorial(int n)
    {
        int fact = 1;

        for(int i = 1; i<= n; i++){
            fact = fact * i;
        }
        return fact;
    }
}

public class FactorialMethod {
    public static void main(String[] args) {
        
        Factorial f1 = new Factorial();

        int result = f1.factorial(4);
        System.out.println(result);
    }
    
}
