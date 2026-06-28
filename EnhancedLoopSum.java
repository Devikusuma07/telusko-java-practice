public class EnhancedLoopSum {
    public static void main(String[] args) {
        int arr[] = {57, 45, 67, 34};
        int sum = 0;
        for(int num : arr) {
            sum += num;
            System.out.println("Current number: " + num + ", Current sum: " + sum);
        }
    }
    
}
