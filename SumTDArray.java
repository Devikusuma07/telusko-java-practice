public class SumTDArray {
    public static void main(String[] args) {
        int[][] num = {{1,2}, {3,5}, {4,5}};
        int sum = 0;
        for(int i =0; i < num.length; i++) {
            for(int j = 0; j < num[i].length; j++) {
                sum += num[i][j];            
            }
        }
        System.out.println("The sum of the elements in the array is : " + sum);
    }

}
