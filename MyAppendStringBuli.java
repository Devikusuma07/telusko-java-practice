public class MyAppendStringBuli {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Devi");
        sb.append(" Kusuma");
        sb.insert(3, " Devi");
        sb.delete(8, 9);
        sb.reverse();
        System.out.println(sb);
        
    }
    
}
