class Sum{
    int a;
    int b;

    void sum(int a, int b)
    {
        System.out.println("Sum of two numbers is : " + (a + b));
    }
}

public class SumMethod {
    public static void main(String[] args) {
        
        Sum s1 = new Sum();

        s1.sum(2, 5);
    }
    
}
