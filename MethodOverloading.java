class Demo 
{
    public int add(int a, int b, int c)
    {
        System.out.println("Adding three integers: " + a + ", " + b + "," +c);
        return a + b + c;
    } 
    public int add(int a, int b) 
    {
        System.out.println("Adding two integers: " + a + ", " + b);
        return a + b;
    }
    public double add(double a, int b)
    {
        System.out.println("Adding double and int: " + a + ", " + b);
        return a + b;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {

        Demo demo = new Demo();

        int r1 = demo.add(1,4);
        int r2 = demo.add(1,4,5);
        double r3 = demo.add(1.5, 4);

        System.out.println("Result of add(1,4): " + r1);
        System.out.println("Result of add(1,4,5): " + r2);
        System.out.println("Result of add(1.5,4): " + r3);
    }
    
}
