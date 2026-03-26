public class DiaTDArray {
    public static void main(String[] args) {
        int num[][] = {{1,2,4}, {3,5,8}, {3,5,6}};
        System.out.println("The diagonal elements of the array are : ");

        for(int i =0; i < num.length; i++) {
            for(int j = 0; j<num[i].length; j++) {
                if(i == j) {
                    System.out.println( num[i][j]);
                }
            }
        }
    }
    
}
