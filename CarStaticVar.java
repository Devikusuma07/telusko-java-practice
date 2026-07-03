class car {
    String brand;
    static int wheels;

    public void show() {
        System.out.println("Car Brand: " + brand + " Car Wheels: " + wheels);
    }

}
public class CarStaticVar {
    public static void main(String[] args) {
        car c1 = new car();
        c1.brand = "BMW";
        car.wheels = 4;

        c1.show();
    }
}
