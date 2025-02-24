import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // To Generate a random number between 1 and 100, we initialize
        int randomNumber = (int) (Math.random() * 100) + 1; //We do this so that the number doesn't have decimals.
        int userGuess = 0; //This states that the number starts from 0.

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("Try to guess a number between 0 and 100");

        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number: " + randomNumber);
            }
        }

        scanner.close();
    }
}
