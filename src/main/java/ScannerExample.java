import java.util.Scanner;
public class ScannerExample{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your name");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("What's your age?");
        int age = scanner.nextInt();
        if (age >10) {
            System.out.println("You can register");
            System.out.println("Happy to see you.");

            }else{
                System.out.println("You cannot register");
            }
        }
        }

