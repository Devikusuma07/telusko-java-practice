class Blockk{
    static String name;
    static int age;

    static {
        name = "devi";
        
        System.out.println("in the static block");
    }
    static {
        age = 17;
        System.out.println("in the second block");
    }
}
public class myStaticBlock {
    public static void main(String[] args) {
       System.out.println(Blockk.name + Blockk.age);

        
    }
    
}
