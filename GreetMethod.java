class Greet{

    String name;

    void greet(String name)
    {
        System.out.println("Hello!" + name);

    }
}

public class GreetMethod {
    public static void main(String[] args) {
        
        Greet g1 = new Greet();

        g1.greet("Devi");
    }
    
}
