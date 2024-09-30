public class Q64 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Prime numbers are greater than 1
        if (number <= 1) {
            return false;
        }

        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not a prime number if divisible by any number other than 1 and itself
            }
        }

        return true; // Prime number if no divisors are found
    }

    // Main method to test the isPrime function
    public static void main(String[] args) {
        int number = 29; // Example number
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
