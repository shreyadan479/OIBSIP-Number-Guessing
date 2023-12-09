import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int maxAttempts = 5; // You can adjust the maximum number of attempts
        int score = 100; // Initial score

        System.out.println("Welcome to Guess the Number Game!\n");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound);

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("\nAttempt: " + attempts + " \nEnter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("\nCongratulations! You guessed the number.");
                System.out.println("\nYour score is: " + score);
                break;
            } else {
                System.out.println("\nWrong guess!");

                if (userGuess < randomNumber) {
                    System.out.println("\nTry a higher number.");
                } else {
                    System.out.println("\nTry a lower number.");
                }

                // Adjust the score based on the number of attempts
                score -= 20; // You can adjust the scoring system
            }

            if (attempts == maxAttempts) {
                System.out.println("\nSorry, you've run out of attempts. The correct number was: " + randomNumber);
            }
        }

        scanner.close();
    }
}