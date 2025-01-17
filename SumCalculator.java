public class SumCalculator {
    // Method to calculate the sum of three numbers
    public static int calculateSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Main method to test the calculateSum method
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30; // Example inputs
        int sum = calculateSum(a, b, c);
        System.out.println("The sum of the numbers is: " + sum);
    }
}
