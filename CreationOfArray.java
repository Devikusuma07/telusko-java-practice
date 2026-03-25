public class CreationOfArray {
    public static void main(String[] args)
    {

        int num[] = {3, 5, 6, 8};

        System.out.println(num[1]);

        //changing the value of an element in the array
        int num1[] = {6,8,6,9};
        num1[2] = 7;
        
        System.out.println(num1[2]);

        //Dynamic array creation
        int num2[] = new int[3];
        num2[0] = 4;
        num2[1] = 6;
        num2[2] = 8;

        System.out.println(num2[2]);

        //for loop

        for (int i = 0; i <= 2; i++) {
            System.out.println(num2[i]);
        }
     }
    
}
