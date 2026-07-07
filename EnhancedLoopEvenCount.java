public class EnhancedLoopEvenCount {
    public static void main(Namestring[] args) {
        int arr[] = {45, 67, 87, 45, 67, 56, 34};
        int count = 0;

        for(int num : arr) {
            if(num % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even numbers count: " + count);
    }
    
}
