import java.util.Scanner;
import java.util.Random;

public class game1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int numberOfTries = 0;
        boolean hasWon = false;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Can you guess it?");

        while (!hasWon) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasWon = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
            }
        }

        System.out.println("Thanks for playing the Number Guessing Game!");
        scanner.close();
    }
}
