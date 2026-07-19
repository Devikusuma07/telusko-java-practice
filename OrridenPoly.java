class Shape {
    void draw(){
        System.out.println("Draw");
    }
}

class Circle {
    void draw(){
        System.out.println("Draw Circle");
    }
}
public class OrridenPoly {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();

        Circle c1 = new Circle();
        c1.draw();
    }
    
}
