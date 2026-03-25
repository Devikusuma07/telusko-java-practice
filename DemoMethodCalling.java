class Calling 
{
    void Show()
    {
        System.out.println("Method called from main()");
    }
}
public class DemoMethodCalling {
    public static void main(String[] args) {
        Calling c1 = new Calling();
        c1.Show();
    }
    
}