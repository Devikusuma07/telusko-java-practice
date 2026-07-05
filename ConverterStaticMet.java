class Converter{
    static double celsiusToFahrenheit(double  c){
        return (c * 9/5) +32;
    }
    static double kmToMiles(double km) {
        return km * 0.621371;
    }
}

public class ConverterStaticMet {
    public static void main(String[] args) {
        System.out.println("25°C in Fahrenheit: " + Converter.celsiusToFahrenheit(78));
        System.out.println("10 km in Miles: " + Converter.kmToMiles(10));
    }
    
}
