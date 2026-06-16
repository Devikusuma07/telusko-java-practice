class Square{
    int n;

    void square(int n){
        System.out.println("Square Number : " + n * n);
    }
}

public class SquareNum {
    public static void main(String[] args) {
        
        Square s1 = new Square();

        s1.square(5);
    }
    
}
