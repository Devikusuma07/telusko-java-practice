public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        
        // Logical AND (&&)
        boolean andResult = (a < b) && (b < c);
        System.out.println("Logical AND (a < b && b < c): " + andResult);

        // Logical OR (||)
        boolean orResult = (a > b) || (b < c);
        System.out.println("Logical OR (a > b || b < c): " + orResult);

        // Logical NOT (!)
        boolean notResult = !(a < b);
        System.out.println("Logical NOT (!(a < b)): " + notResult);
    }
    
}
