public class C_RError {
    public static void main(String[] args) {

        //compile-time error example

        //int a = 10. -> Missing semicolon (;) after int a = 10 The compiler will stop the program from compiling
        int a = 10;
        System.out.println(a);

        // Run-time error example

        //Division by zero is not allowed Error occurs while running the program
        int b = 10;
        int c = 0;
        int result = b / c; // Division by zero error
        System.out.println(result);
    }

    
}
