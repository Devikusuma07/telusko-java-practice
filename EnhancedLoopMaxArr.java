public class EnhancedLoopMaxArr {
    public static void main(Namestring[] args) {
        int arr[] = {45, 56, 78, 23,56};

        int max = arr[0];
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value: " + max);
    }
    
}
