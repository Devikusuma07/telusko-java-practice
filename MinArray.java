public class MinArray {
    public static void main(String[] args) {
        int num[] = {67, 89, 865, 796};

        int min = num[0];

        for(int i = 0; i < num.length; i++){
            if(num[i] < min) {
                min = num[i];
            }

        }
        System.out.println(min);
    }
    
}
