class Palindrome 
{
    public boolean isPalindrome(int n)
    {
        int Original = n;
        int reverse = 0;

        while(n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return Original == reverse;
    }
}

public class PalindromeMethod {
    public static void main(String[] args) {

        Palindrome p1 = new Palindrome();

        boolean result = p1.isPalindrome(121);
        System.out.println(result);
        
    }
    
}
