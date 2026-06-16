public class SquareArray {
    public static void main(String[] args) {
        int num[] = {10, 20, 58, 49, 2};
        
        for(int i = 0; i < num.length; i++) {
            num[i] *= num[i];
            System.out.println(num[i]);
        }
        
    }
    
}
