import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Check if the number is non-negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial
            long factorial = calculateFactorial(number);

            // Display the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to calculate factorial of a number
    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply result by i
        }
        return result;
    }
}
