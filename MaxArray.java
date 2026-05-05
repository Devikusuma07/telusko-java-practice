public class MaxArray {
    public static void main(String[] args) {
        int num[] = {45, 6,76,35};

        int max = num[0];

        for(int i = 0; i < num.length; i ++) { 
            if(num[i] > max) {
                max = num[i];
                
                System.out.println(max);  
            }
        }
    }
    
}
