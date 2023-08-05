import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rangeStart = 1;
        int rangeEnd = 100;
        int secretNumber = random.nextInt(rangeEnd - rangeStart + 1) + rangeStart;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess the number between " + rangeStart + " and " + rangeEnd + ".");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Try again! The number is higher.");
            } else {
                System.out.println("Try again! The number is lower.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Out of attempts! The secret number was: " + secretNumber);
        }

        scanner.close();
    }
}
