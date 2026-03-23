// Write a program to display command line arguments.
public class CommandLineArgs {
    public static void main(String[] args) {

        System.out.println("Command-Line Arguments:");
        
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }  
}
