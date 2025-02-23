import java.util.Random;
import java.util.Scanner;

public class SimpleMathQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean continueQuiz = true;

        System.out.println("Welcome to the Simple Math Quiz!");
        System.out.println("You can quit at any time by typing 'quit'.");

        while (continueQuiz) {
            // Generate two random numbers and a random operation
            int num1 = random.nextInt(10) + 1; // Random number between 1 and 10
            int num2 = random.nextInt(10) + 1; // Random number between 1 and 10
            String[] operations = {"+", "-", "*", "/"};
            String operation = operations[random.nextInt(operations.length)];

            // Calculate the correct answer based on the operation
            int correctAnswer = 0;
            switch (operation) {
                case "+":
                    correctAnswer = num1 + num2;
                    break;
                case "-":
                    correctAnswer = num1 - num2;
                    break;
                case "*":
                    correctAnswer = num1 * num2;
                    break;
                case "/":
                    correctAnswer = num1 / num2; // Integer division
                    break;
            }

            // Ask the user for their answer
            System.out.println("What is " + num1 + " " + operation + " " + num2 + "?");
            String userInput = scanner.nextLine(); // Read input as a string

            // Allow user to quit
            if (userInput.equalsIgnoreCase("quit")) {
                continueQuiz = false;
                continue;
            }

            // Convert the input to an integer
            try {
                int userAnswer = Integer.parseInt(userInput);

                // Check if the answer is correct
                if (userAnswer == correctAnswer) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! The correct answer is " + correctAnswer + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number or type 'quit' to exit.");
            }

            System.out.println("Your current score is: " + score);
        }

        System.out.println("Thanks for playing! Your final score is: " + score);
        scanner.close();
    }
}
