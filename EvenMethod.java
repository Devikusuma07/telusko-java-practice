class Even {
    int n;

    public boolean isEven(int n)
    {
        if(n % 2 == 0){
           return true;
        } else {
            return false;
        }
    }
}

public class EvenMethod {
    public static void main(String[] args) {
        
        Even e1 = new Even();

        boolean result = e1.isEven(14);
        System.out.println(result);
    }
    
}
