public class MaxTDArray {
    public static void main(String[] args) {
        int num[][] = {{3,45,44},{56,68,89}};

        int max = num[0][0];
        for(int i = 0; i < num.length; i++) {
            for(int j = 0; j < num[i].length; j++) {
                if(num[i][j] > max) {
                    max = num[i][j];
                }
            }

        }
        System.out.println("The maximum element in the array is : " + max);
    }
    
}
