/*Create a class Mobile

variables: brand, price

method: showDetails() */

class Mobile
{
    String brand;
    float price;

    void showDetails()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }
}

public class Mobileclass {
    public static void main(String[] args) {
        
        Mobile m1 = new Mobile();

        m1.brand = "Apple";
        m1.price = 100000.0f;

        m1.showDetails();

    }
    
}
