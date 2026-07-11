public class my {
    public static void main(String[] args) {

        String str = "Kusuma";

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + sb);
    }
    
}
