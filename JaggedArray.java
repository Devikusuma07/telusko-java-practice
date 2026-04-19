public class JaggedArray {
    public static void main(String[] args) {
        int jag[][] = new int[3][];

        jag[0] = new int[3];
        jag[1] = new int[2];
        jag[2] = new int[4];

        for(int i = 0; i < jag.length;i++){
            for(int j = 0; j < jag[i].length;j++){
                jag[i][j] = (int)(Math.random() * 100);
                System.out.print(jag[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
}
