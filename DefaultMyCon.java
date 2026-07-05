class car{
    String name;
    int price;
    String color;
    
    // Default Constructor
    car(){
        this.name = "UNKNOWN";
        this.price = 0;
        this.color = "UNKNOWN";
    }

    // Parameterized Constructor
    car(String n, int p, String c) {
        this.name = n;
        this.price = p;
        this.color = c;
    }
}

public class DefaultMyCon {
    public static void main(String[] args) {
        car  c = new car();
        /*c.name = "BMW";
        c.price = 5000000;
        c.color = "Black";*/
        System.out.println("Name : " + c.name + " Price : " + c.price + " Color : " + c.color);
    }
    
}
