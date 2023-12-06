import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        // Initialize variables
        int numberOfAttempts = 0;
        boolean hasGuessedCorrectly = false;

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");

        // Main game loop
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess (between 1 and 100): ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a valid number between 1 and 100.");
            } else if (userGuess == targetNumber) {
                hasGuessedCorrectly = true;
            } else if (userGuess < targetNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        // Game over
        System.out.println("Congratulations! You guessed the correct number in " + numberOfAttempts + " attempts.");
        
        // Close the scanner
        scanner.close();
    }
}
