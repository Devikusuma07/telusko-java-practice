class Calculator 
{
    // creation of variable;
    int a;

    public int add (int n1 , int n2) 
    {
        int r = n1 + n2;
        return r;

    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Calculator calc = new Calculator();

        int result = calc.add(4,5);

        System.out.println(result);
    }
    
}
