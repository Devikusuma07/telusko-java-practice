public class TransTDArray {
    public static void main(String[] args) {
        int[][] arr = {{4,5}, {7,9},{2,3},{9,10}};
        int rows = arr.length;
        int cols = arr[0].length;

        int transport[][] = new int[cols][rows];

        for(int i = 0; i< rows; i++) {
            for(int j = 0; j <cols; j++){
                transport[j][i] = arr[i][j];
            }
        }
        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < rows; j++) {
                System.out.print(transport[i][j] + " ");
            }
            System.out.println();
        }
    System.out.println();
    }
}
