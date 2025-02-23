import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000; // Starting balance as an integer
        String choice = "yes"; // Initialize choice to enter the loop

        System.out.println("Welcome to the ATM Simulator!");

        while (choice == "yes") {
            System.out.println("\nChoose an option:");
            System.out.println("1: Check Balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Exit");
            System.out.print("Enter your choice (1, 2, 3, or 4): ");
            int option = scanner.nextInt(); // Get user choice

            switch (option) {
                case 1: // Check Balance
                    System.out.println("Your current balance is: $" + balance);
                    break;
                case 2: // Deposit
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = scanner.nextInt(); // Get deposit amount
                    if (depositAmount > 0) {
                        balance += depositAmount; // Update balance
                        System.out.println("You deposited: $" + depositAmount);
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;
                case 3: // Withdraw
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt(); // Get withdrawal amount
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount; // Update balance
                        System.out.println("You withdrew: $" + withdrawAmount);
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient funds!");
                    }
                    break;
                case 4: // Exit
                    choice = "no"; // Set choice to exit the loop
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1, 2, 3, or 4.");
            }
        }

        System.out.println("Thank you for using the ATM Simulator!");
        scanner.close();
    }
}

