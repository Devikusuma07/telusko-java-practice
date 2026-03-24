public class CountEleJaggedArray {
    public static void main(String[] args) {
        int num[][] = new int[3][];

        num[0] = new int[3];
        num[1] = new int[2];
        num[2] = new int[4];

        int count = 0;

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                num[i][j] = (int)(Math.random() * 100);
                count++;
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Total number of elements in jagged array: " + count);
    }
    
}
