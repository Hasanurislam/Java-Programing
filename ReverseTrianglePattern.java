public class ReverseTrianglePattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the triangle

        for (int i = rows; i >= 1; i--) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
