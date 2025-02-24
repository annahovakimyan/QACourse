import java.util.Scanner;

public class RollerCoasterRide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height in cm: ");
        int height = scanner.nextInt();

        // Check if the rider can ride the roller coaster
        if (height < 140) {
            System.out.println("Sorry, you are too short to ride.");
        } else if (height > 200) {
            System.out.println("Sorry, you are too tall to ride.");
        } else if (age < 12) {
            System.out.println("Sorry, you are not allowed to ride.");
        } else if (age < 18) {
            System.out.println("You need parental permission to ride.");
        } else {
            System.out.println("You can ride the roller coaster! Enjoy!");
        }

        scanner.close();
    }
}
