class car{
    String Brand;
    int price;

    public car() {
        this.Brand = "UNKNOWN";
        this.price = 5778;
    }
}


public class MyConstructor {
    public static void main(String[] args) {
        car c = new car();
        System.out.println("Brand : " + c.Brand + " price : " + c.price);
    }
    
}
