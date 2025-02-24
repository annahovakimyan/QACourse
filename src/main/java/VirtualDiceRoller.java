import java.util.Random;
import java.util.Scanner;

public class VirtualDiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] rollCounts = new int[6]; // Array to count rolls of each number (1-6)
        String choice = "yes"; // Initialize choice to enter the loop

        System.out.println("Welcome to the Virtual Dice Roller!");

        // Continue rolling while the user chooses to roll again
        while (choice.equals("yes")) {
            // Simulate rolling the dice (1 to 6)
            int roll = random.nextInt(6) + 1; // Generate a number between 1 and 6
            rollCounts[roll - 1]++; // Increment the count for the rolled number
            System.out.println("You rolled a " + roll + "."); // Display the rolled number

            // Ask the user if they want to roll again
            System.out.print("Do you want to roll again? (yes/no): ");
            choice = scanner.next(); // Get user input (next token)
        }

        // Display a summary of the rolls
        System.out.println("Summary of Rolls:");
        for (int i = 0; i < rollCounts.length; i++) {
            System.out.println((i + 1) + ": " + rollCounts[i] + " time(s)"); // Display each count
        }

        System.out.println("Thanks for playing!"); // Thank the user
        scanner.close();
    }
}
