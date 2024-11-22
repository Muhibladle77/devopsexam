public class Prime {
    public static void main(String[] args) {
        int num = 29; // You can change this to test other numbers
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // If divisible by any number other than 1 and itself
        }
        return true;
    }
}
