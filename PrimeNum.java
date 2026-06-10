public class PrimeNum {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Prime numbers up to " + n + " are:");

        for(int i = 2; i<= n; i++) {
            boolean isPrime = true;
            for(int j = 2; j < Math.sqrt(i); j++){
                if(i % j == 0) {
                    isPrime = false;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
    }
    
} // explation of the code: This Java program prints all prime numbers up to 100. It uses a nested loop where the outer loop iterates through numbers from 2 to 100, and the inner loop checks if the current number is divisible by any number from 2 to the square root of that number. If it finds any divisors, it marks the number as non-prime. If no divisors are found, it prints the number as a prime.
