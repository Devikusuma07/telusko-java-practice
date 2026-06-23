public class ThreeDArray {
    public static void main(String[] args) {
        int num[][][] = new int[3][3][3];

        int count = 0;

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                for(int k = 0; k < num[i][j].length; k++){
                    num[i][j][k] = (int)(Math.random() * 100);
                    System.out.print(num[i][j][k] + " ");
                    count++;
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        System.out.println("Total number of elements in 3D array: " + count);
    }
    
}
