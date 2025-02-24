import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        int number;

        System.out.println("Enter a series of numbers (enter -1 to stop):");

        while (true) {
            // Read the user's input
            number = scanner.nextInt();

            // Check if the user wants to stop the program
            if (number == -1) {
                break; // Exit the loop if -1 is entered
            }

            // Check if the number is even or odd
            if (number % 2 == 0) {
                evenCount++; // Increment even count
                System.out.println(number + " is even.");
            } else {
                oddCount++; // Increment odd count
                System.out.println(number + " is odd.");
            }

            // Display the total counts after each input
            System.out.println("Total even numbers: " + evenCount);
            System.out.println("Total odd numbers: " + oddCount);
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
