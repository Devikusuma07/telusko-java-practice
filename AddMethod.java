class Add{
    int a;
    int b;

    public int add(int a, int b) {
        return a + b;
    }
}

public class AddMethod {
    public static void main(String[] args) {
        Add a1 = new Add();

        int result = a1.add(14, 7);
        System.out.println("The Addition of a and b is : " + result);


    }
    
} 
