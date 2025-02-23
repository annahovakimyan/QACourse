import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;
        int computerScore = 0;
        boolean keepPlaying = true;

        while (keepPlaying) {
            System.out.println("Rock, Paper, Scissors Game!");
            System.out.println("Enter your move (Rock, Paper, Scissors). Type 'quit' to exit.");
            String userMove = scanner.nextLine();

            if (userMove.equals("quit")) {
                keepPlaying = false;
                System.out.println("Thanks for playing!");
                continue;
            }

            // Validate user's move
            if (!(userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors"))) {
                System.out.println("Invalid input. Please enter 'Rock', 'Paper', or 'Scissors'.");
                continue;
            }

            // Generate computer's move randomly
            int computerChoice = random.nextInt(3);  // 0 = Rock, 1 = Paper, 2 = Scissors
            String computerMove = "";
            if (computerChoice == 0) {
                computerMove = "rock";
            } else if (computerChoice == 1) {
                computerMove = "paper";
            } else {
                computerMove = "scissors";
            }

            System.out.println("Computer chose: " + computerMove);

            // Determine the winner
            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                    (userMove.equals("paper") && computerMove.equals("rock")) ||
                    (userMove.equals("scissors") && computerMove.equals("paper"))) {
                System.out.println("You win this round!");
                userScore++;
            } else {
                System.out.println("Computer wins this round!");
                computerScore++;
            }

            // Display current score
            System.out.println("Current Score -> You: " + userScore + " | Computer: " + computerScore);

            // Ask user if they want to keep playing
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (playAgain.equals("no")) {
                keepPlaying = false;
                System.out.println("Thanks for playing!");
            }
        }

        // Final score display
        System.out.println("Final Score -> You: " + userScore + " | Computer: " + computerScore);
        scanner.close();
    }
}
