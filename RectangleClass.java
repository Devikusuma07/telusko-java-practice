

class rectangle{
    Float length;
    Float breath;

    void display(){
        System.out.println("Length : " + length);
        System.out.println("Breath : " + breath);
        System.out.println("Area of the rectangle : " + length * breath);
    }
}
public class RectangleClass {
    public static void main(String[] args) {

        rectangle r1 = new rectangle();

        r1.length = 24.76f;
        r1.breath = 14.40f;

        r1.display();
        
    }
    
}
