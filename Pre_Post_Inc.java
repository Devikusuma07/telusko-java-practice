public class Pre_Post_Inc {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println("Initial value of a: " + a);

        // Post-increment
        int post = a++;
        System.out.println("After post-increment, post: " + post);
        System.out.println("Value of a after post-increment: " + a);

        // pre-increment
        int pre = ++b;
        System.out.println("After pre-increment, pre: " + pre);
        System.out.println("Value of a after pre-increment: " + b);

        //Predict the output:
        int g = 5;
        int k = g++ + ++g;
        System.out.println(k);
        //explanation:
        // k = 5 + 7 = 12

    }
}
