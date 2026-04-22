public class MainMethod {
    public static void main(String[] args) {
        System.out.println("Original main");
        main(10);
        main("Devi");
    }

    public static void main(int a) {
        System.out.println("int main: " + a);
    }

    public static void main(String name) {
        System.out.println("String main: " + name);
        System.out.println();
    }
}

