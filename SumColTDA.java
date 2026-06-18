public class SumColTDA {
    public static void main(String[] args) {
        int[][] arr = {{35,35,30}, {45,30, 25}, {40, 30, 30}};
        
        for(int j = 0; j<arr[0].length;j++) {
            int sum = 0;
            for(int i = 0; i<arr.length;i++) {
                sum += arr[i][j]; 
            }
            System.out.println("The sum of the elements in column " + j + " is : " + sum);
            sum = 0;
        }
    }
}
