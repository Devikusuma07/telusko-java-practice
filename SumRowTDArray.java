public class SumRowTDArray {
    public static void main(String[] args) {
        int[][] arr = {{35,35,30}, {45,30, 25}, {40, 30, 30}};
        int sum = 0;

        for(int i = 0; i<arr.length;i++) {
            for(int j = 0; j<arr[i].length;j++) {
                sum += arr[i][j];
            }
            System.out.println("The sum of the elements in row " + i + " is : " + sum);
            sum = 0;
        }
    }
    
}
