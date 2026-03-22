class car
{
    String Colour;
    String Brand;
    String Num;

    void display() {
        System.out.println("Car Colour: " + Colour);
        System.out.println("Car Brand: " + Brand);
        System.out.println("Car Number: " + Num);
        System.out.println("");

    }
}

public class CarDetails {
    public static void main(String[] args){

        car c1 = new car();
        c1.Colour = "Black";
        c1.Brand = "BMW";
        c1.Num = "ZX454g45rg";

        c1.display();


    }
    
}
