class Demo{

    public String Display(String name) 
    {
        return "Hello, " + name + "!";
    }
    public String Display(String name, int age)
    {
        return "Hello, " + name + "! Your age is " + age;
    }
}


public class DispalyMOLoding {
    public static void main(String[] args) {
        
        Demo d1 = new Demo();

        String s1 = d1.Display("Kusuma");
        String s2 = d1.Display("kusu", 20);

        System.out.println("Result of Display(\"Kusuma\"): " + s1);
        System.out.println("Result of Display(\"kusu\", 20): " + s2);
    }
    
}
