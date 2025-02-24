import java.util.Scanner;

public class ReverseThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting a random 3-digit number
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        // Checking if the number is a 3-digit number
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid 3-digit number.");
        } else {
            // Reversing the number using modulus
            int lastDigit = number % 10;           // To get the last digit
            int middleDigit = (number / 10) % 10;  // To get the middle digit
            int firstDigit = number / 100;          // To get the first digit

            // Finally, combining the digits in reverse order:
            int reversedNumber = lastDigit * 100 + middleDigit * 10 + firstDigit;

            // Print the reversed number
            System.out.println("Reversed Number: " + reversedNumber);
        }

        scanner.close();
    }
}
