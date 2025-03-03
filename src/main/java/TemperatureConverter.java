import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "yes"; // Initialize choice to enter the loop

        System.out.println("Welcome to the Temperature Converter!");

        while (choice.equals("yes")) {//do it in do while 
            System.out.println("Select the conversion type:");
            System.out.println("1: Celsius to Fahrenheit");
            System.out.println("2: Fahrenheit to Celsius");
            System.out.print("Enter your choice (1 or 2): ");
            int conversionType = scanner.nextInt(); // Get user choice

            System.out.print("Enter the temperature: ");
            int temperature = scanner.nextInt(); // Get the temperature input
            double convertedTemperature = 0; // Variable to hold the converted temperature

            // Perform the conversion based on user choice
            if (conversionType == 1) {
                // Celsius to Fahrenheit
                convertedTemperature = (temperature * 9/5) + 32;
                System.out.println(temperature + "°C is " + convertedTemperature + "°F.");
            } else if (conversionType == 2) {
                // Fahrenheit to Celsius
                convertedTemperature = (temperature - 32) * 5/9;
                System.out.println(temperature + "°F is " + convertedTemperature + "°C.");
            } else {
                System.out.println("Invalid choice! Please select 1 or 2.");
            }

            // Ask the user if they want to perform another conversion
            System.out.print("Do you want to convert another temperature? (yes/no): ");
            choice = scanner.next(); // Get user input for continuing
        }

        System.out.println("Thanks for using the Temperature Converter!"); // Thank the user
        scanner.close();
    }
}

